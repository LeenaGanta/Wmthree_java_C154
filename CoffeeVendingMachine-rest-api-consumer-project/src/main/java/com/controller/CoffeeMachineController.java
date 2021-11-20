package com.controller;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

import com.beans.AddOns;
import com.beans.Bill;
import com.beans.CoffeeBeans;
import com.beans.Strings;
import com.beans.User;
import com.service.BillService;
import com.service.CoffeeService;
import com.service.UserService;
import com.service.VoucherService;

@SessionAttributes({"user"})
@RestController
public class CoffeeMachineController {

	List<String> coffeeOrdered=new ArrayList<String>();
	ArrayList<String> coffeeBill=new ArrayList<String>(); 
	ArrayList<String> addonsBill=new ArrayList<String>();
	User user=null;

	@Autowired
	private UserService userService;
	
	@Autowired
	private CoffeeService coffeeService;
	
	@Autowired
	private BillService billService;
	
	@Autowired
	private VoucherService voucherService;
	
	public ArrayList<String> getBillDetails() 
	{
		ArrayList<String> bill=new ArrayList<String>();
		for(int i=0;i<coffeeBill.size();i++)
	    	bill.add(coffeeService.getCoffeeName(coffeeBill.get(i))+", "+coffeeService.getCoffeeSize(coffeeBill.get(i))+  " : "+coffeeService.getCoffeePrice(coffeeBill.get(i)));
		for(int i=0;i<addonsBill.size();i++)
			bill.add(addonsBill.get(i)+ " : "+coffeeService.getAddOnPrice(addonsBill.get(i)));
     	return bill;
	}
	
	@RequestMapping("/")
	public ModelAndView showLoginPage() {
		return new ModelAndView("login","command",new User() );
	}
	
	@RequestMapping("/loginCheck")
	public ModelAndView showMenuController(@ModelAttribute("command") User user) {
		if(userService.userValidate(user)) {
			ModelAndView mv=new ModelAndView();
			this.user=user;
			mv.addObject("user", user);
			mv.setViewName("home");
			return mv;
		}
		return new ModelAndView("login", "message", "Login Failed");
	}
	
	@RequestMapping(path="/registerPage")
	public ModelAndView registerController()
	{
		return new ModelAndView("register", "command", new User());
	}
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("command") User user)
	{
		if(user.getMobileNo().length()==10 && user.getName()!="")
		{
			try {
				userService.addUser(user);
				return new ModelAndView("register","message", "Registered Successfully!");
			}
			
			catch(DuplicateKeyException| HttpServerErrorException exc) {
				return new ModelAndView("register","message","Already a registered User");}
		}
			return new ModelAndView("register", "message", "Please enter Valid Number");
	}
	
	@RequestMapping("/addCoffee")
   public ModelAndView addCoffeestoBill(@RequestParam(value="coffee") String coffee,@RequestParam(value="cupSize") String cupSize)
   {
		ModelAndView mv=orderPage();
		mv.addObject("message","Coffee Added");
		String str=coffee+":"+cupSize;
		coffeeOrdered.add(str);
		coffeeBill.add(coffeeService.getCoffeId(coffee,cupSize));
		System.out.println(coffeeBill);
		coffeeService.addCoffee(coffee, cupSize);
		mv.addObject("coffeeOrdered",coffeeOrdered);
		return mv;
	}
	
	@RequestMapping("/coffeeMenu")
	public ModelAndView coffeeDetails()
	{
		ModelAndView mv1=new ModelAndView();
		CoffeeBeans[] coffees=coffeeService.getCoffees();
		AddOns[] addOns=coffeeService.getAddOnDetails();
		mv1.addObject("addOns",addOns);
		mv1.addObject("coffees",coffees);
		mv1.setViewName("menu");
		return mv1;
	}
	
	@RequestMapping("/order")
	public ModelAndView orderPage() {
		ModelAndView mv=new ModelAndView();
		Strings[] coffees=coffeeService.getCoffeeTypes();
 		mv.addObject("coffees", coffees);
		Strings[] cupSizes=coffeeService.getCupSizes();
		mv.addObject("cupSizes",cupSizes);
		mv.setViewName("orderCoffee");
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView homePage()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping("/addOns")
	public ModelAndView addOnPage()
	{
		ModelAndView mv=orderPage();
		Strings[] addOns=coffeeService.getAddOns();
		mv.addObject("addOns",addOns);
		mv.setViewName("orderAddOn");
		return mv;
	}
	
	@RequestMapping("/addAddOn")
	public ModelAndView addAddOnstoBill(@RequestParam("addOn") String addOn) {
		ModelAndView mv=addOnPage();
		addonsBill.add(addOn);
		coffeeService.addAddOn(addOn);
		mv.addObject("message","AddOn added");
		return mv;
	}
	
	
	@RequestMapping("/check")
	public ModelAndView checkDetails()
	{
		ArrayList<String> bill=getBillDetails();
		return new ModelAndView("checkPage", "billDetails", bill);
	}
	
	@RequestMapping("/bill")
	public ModelAndView billPage() {
		return new ModelAndView("askForVoucher");
	}
	

	
	@RequestMapping("/billVoucher")
	public ModelAndView billVoucher(@RequestParam("valid") String valid) {
		if(valid.equals("yes"))
		{
			return new ModelAndView("billVoucherInput");
		}
		else {
			ModelAndView mv=new ModelAndView();
			ArrayList<String> billDetails=getBillDetails();
			mv.addObject("billDetails",billDetails);
			Bill[] bill=billService.getBill(user.getMobileNo(),"no");
		//	billService.setBillDetails(coffeeBill);
			mv.addObject("bill", bill);
			mv.setViewName("billWithoutVoucher");
			return mv;
		}
		
	}
	
	@RequestMapping("/billVoucherInput")
	public ModelAndView BillVoucherInput()
	{
		return new ModelAndView("billVoucherInput");
	}
	@RequestMapping("/billWithVoucher")
	public ModelAndView VoucherPage(@RequestParam("voucherCode")String voucherCode)
	{
		ModelAndView mv=new ModelAndView();
		ArrayList<String> billDetails=getBillDetails();
		mv.addObject("billDetails",billDetails);
		if(voucherCode.equals(""))
		{
			Bill[] bill=billService.getBill(user.getMobileNo(), voucherCode);
			//billService.setBillDetails(coffeeBill);
			mv.addObject("bill", bill);
			mv.setViewName("billVoucherInput");
			return mv;	
		}
		if(voucherService.isVoucher(voucherCode))
		{
			mv.addObject("message","Voucher Applied!");
			mv.addObject("messageUser","The payment required for your purchase,");
			Bill[] bill=billService.getBill(user.getMobileNo(), voucherCode);
			//billService.setBillDetails(coffeeBill);
			mv.addObject("bill", bill);
			mv.setViewName("billVoucherInput");
			return mv;	
		}
		else  {
			mv.addObject("message","Not a Valid Voucher!");
			Bill[] bill=billService.getBill(user.getMobileNo(), voucherCode);
			//billService.setBillDetails(coffeeBill);
			mv.addObject("bill", bill);
			mv.setViewName("billVoucherInput");
			return mv;	
		}	
		
	}
	
	@RequestMapping("/logout")
	public ModelAndView logoutSystem(HttpServletRequest request)
	{
		  HttpSession httpSession = request.getSession();
          httpSession.invalidate();
	   	return new ModelAndView("logout","message","Thanks for using our system");
	}
}
