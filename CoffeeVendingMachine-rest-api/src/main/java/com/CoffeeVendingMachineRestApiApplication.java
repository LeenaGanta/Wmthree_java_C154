package com;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication(scanBasePackages = "com")
public class CoffeeVendingMachineRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeVendingMachineRestApiApplication.class, args);
	}
	
	@Bean
    public DriverManagerDataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/coffeevendingmachine");
       dataSource.setUsername( "root" );
       dataSource.setPassword("admin");
       return dataSource;
    }
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		 DriverManagerDataSource dataSource = dataSource();
		return new JdbcTemplate(dataSource);
	}
}
