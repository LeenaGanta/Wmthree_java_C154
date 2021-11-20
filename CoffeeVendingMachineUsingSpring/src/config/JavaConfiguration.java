package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.persistence.BillDao;
import com.persistence.BillDaoImpl;
import com.persistence.BillDetailsDao;
import com.persistence.BillDetailsImpl;
import com.persistence.CoffeeDao;
import com.persistence.CoffeeDaoImpl;
import com.persistence.UserDao;
import com.persistence.UserDaoImpl;
import com.persistence.VoucherVaalidateDaoImpl;
import com.persistence.VoucherValidateDao;
import com.presentation.CoffeePresentation;
import com.presentation.CoffeePresentationImpl;
import com.service.BillService;
import com.service.BillServiceImpl;
import com.service.CoffeeService;
import com.service.CoffeeServiceImpl;
import com.service.UserService;
import com.service.UserServiceImpl;
import com.service.VoucherService;
import com.service.VoucherServiceImpl;

@Configuration
public class JavaConfiguration {

	@Bean
	public BillDao getBillDao()
	{
		return new BillDaoImpl();
	}
	
	@Bean
	public BillDetailsDao getBillDetails()
	{
		return new BillDetailsImpl();
	}
	
	@Bean
	public CoffeeDao getCoffee()
	{
		return new CoffeeDaoImpl();
	}
	
	@Bean
	public UserDao getUser()
	{
		return new UserDaoImpl();
	}
	
	@Bean
	public VoucherValidateDao getVoucher()
	{
		return new VoucherVaalidateDaoImpl();
	}
	
	@Bean
	public BillService getBillService()
	{
		return new BillServiceImpl(getBillDao(), getBillDetails());
	}
	
	@Bean
	public CoffeeService getCoffeeService()
	{
		return new CoffeeServiceImpl(getCoffee());
	}
	
	@Bean
	public UserService getUserService()
	{
		return new UserServiceImpl(getUser());
	}
	
	@Bean
	public VoucherService getVoucherService()
	{
		return new VoucherServiceImpl(getVoucher());
	}
	
	@Bean("coffeePresentation")
	public CoffeePresentation getCoffeePresentation()
	{
		return new CoffeePresentationImpl();
	}
}
