package com.resoucre;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beans.AddOns;
import com.beans.Bill;
import com.beans.CoffeeBeans;
import com.beans.User;
import com.beans.Voucher;
import com.model.service.BillService;
import com.model.service.CoffeeService;
import com.model.service.UserService;
import com.model.service.VoucherService;

@RestController
public class CoffeeResource {
	@Autowired
	private CoffeeService coffeeService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BillService billService;
	
	@Autowired
	private VoucherService voucherService;
	
	// Working
	@RequestMapping(path="/coffees",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<String>> getCoffeeTypes() {
		ArrayList<String> strings=coffeeService.getCoffeeTypes();
		return new ResponseEntity<ArrayList<String>>(strings, HttpStatus.OK);
	}
	
	//Working
	@RequestMapping(path="/addOns",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<String>> getAddOns()  {
		ArrayList<String> strings=coffeeService.getAddOns();
		return new ResponseEntity<ArrayList<String>>(strings, HttpStatus.OK);
	}
	
	//Working
	@RequestMapping(path="/cups",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<String>> getCupSizes() {
		ArrayList<String> strings= coffeeService.getCupSizes();
		return new ResponseEntity<ArrayList<String>>(strings, HttpStatus.OK);
	}
	
	//Working
	@RequestMapping(path="/coffeeMenu",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<ArrayList<CoffeeBeans>> getCoffees() {
		ArrayList<CoffeeBeans> coffees=coffeeService.getCoffees();
		return new ResponseEntity<ArrayList<CoffeeBeans>>(coffees,HttpStatus.OK);
	}
	
	//Working
	@RequestMapping(path="/addOnMenu",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<AddOns>> getAddOnDetails() {
		ArrayList<AddOns> addOns= coffeeService.getAddOnDetails();
		return new ResponseEntity<ArrayList<AddOns>>(addOns,HttpStatus.OK);
	}
	
	//Working
	@GetMapping(path="/coffeeMenu/{coffee}/{size}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getCoffeId(@PathVariable("coffee")String coffee,@PathVariable("size")String size){
		String coffeeId= coffeeService.getCoffeId(coffee, size);
		return new ResponseEntity<String>(coffeeId, HttpStatus.OK);
	}
	
	//Working
	@GetMapping(path="/addOns/{addon}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAddOnId(@PathVariable("addon") String addon)  {
		String addOnId=coffeeService.getAddOnId(addon);
		return new ResponseEntity<String>(addOnId, HttpStatus.OK);
	}
	
	//Working
	@GetMapping(path="/coffeeMenu/coffees/{coffee}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Double> getCoffeePrice(@PathVariable("coffee") String coffee)  {
		Double price=coffeeService.getCoffeePrice(coffee);
		return new ResponseEntity<Double>(price,HttpStatus.OK);
	}
	
	//Working
	@GetMapping(path="/addOnMenu/{addOn}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Double> getAddOnPrice(@PathVariable("addOn") String addOn)  {
		Double price= coffeeService.getAddOnPrice(addOn);
		return new ResponseEntity<Double>(price,HttpStatus.OK);
	}
	
	//Working
	@GetMapping(path="/coffeeMenu/{coffeeId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getCoffeeName(@PathVariable("coffeeId") String coffeeId) {
		String coffeeName=coffeeService.getCoffeeName(coffeeId);
		return new ResponseEntity<String>(coffeeName, HttpStatus.OK);
	}
	
	//Working
	@GetMapping(path="/coffees/{coffeeId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getCoffeeSize(@PathVariable("coffeeId")String coffeeId)  {
		String size=coffeeService.getCoffeeSize(coffeeId);
		return new ResponseEntity<String>(size, HttpStatus.OK);
	}
	
	//Working
	@GetMapping(path="/bill/{mobileNumber}/{voucherCode}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<Bill>> getBill(String mobileNumber,String voucherCode) {
		ArrayList<Bill> bill= billService.getBill(mobileNumber, voucherCode);
		return new ResponseEntity<ArrayList<Bill>>(bill, HttpStatus.OK);
	}
	
	// Working
	@GetMapping(path="/users/{mobileNo}/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> userValidate(@PathVariable("mobileNo")String mobileNo,@PathVariable("name") String name) {
		User user=userService.userValidate(mobileNo, name);
		return new ResponseEntity<User>(user, HttpStatus.FOUND);
	}
	
	//Working
	@PostMapping(path="/users",produces=MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		User user1=userService.addUser(user);
		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}
	
	//Working
	@GetMapping(path="/voucher/{voucherId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Voucher> isVoucher(@PathVariable("voucherId") String voucherId)  {
		Voucher voucher= voucherService.isVoucher(voucherId);
		return new ResponseEntity<Voucher>(voucher, HttpStatus.FOUND);
	}
	
	//Working
	@GetMapping(path="/coffeeMenu/coffees/{coffee}/{size}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Double> addCoffee(@PathVariable("coffee") String coffee,@PathVariable("size") String size)  {
		Double price=coffeeService.addCoffee(coffee, size);
		return new ResponseEntity<Double>(price, HttpStatus.FOUND);
	}
	
	//Working
	@GetMapping(path="/addOnMenu/addOns/{addOn}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Double> addAddOn(@PathVariable("addOn") String addOn)  {
		Double price=coffeeService.addAddOn(addOn);
		return new ResponseEntity<Double>(price, HttpStatus.FOUND);
	}
}
