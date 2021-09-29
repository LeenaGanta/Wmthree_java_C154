package exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Employee 
{
	@Getter
	private String empName;
	@Getter
	private int age;
	

}
