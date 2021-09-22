package retailPrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductQuantitySold 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		ProductsPrices products=new ProductsPrices();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		float p1RetailPrice = 0,p2RetailPrice=0,p3RetailPrice=0,total=0;
		int productNumber=0,quantity=0;
		while(true)
		{
		System.out.println("Enter the product number 1/2/3: ");
		productNumber=Integer.parseInt(br.readLine());
		System.out.println("Enter quantity in number: ");
		quantity=Integer.parseInt(br.readLine());
		switch(productNumber)
		{
		case 1:
			p1RetailPrice=products.getProduct1()*quantity;
			total+=p1RetailPrice;
			//System.out.println(p1RetailPrice);
		    break;
		case 2:
			p2RetailPrice=products.getProduct2()*quantity;
			total+=p2RetailPrice;
			//System.out.println(p2RetailPrice);
			break;
		case 3:
			p3RetailPrice=products.getProduct3()*quantity;
			total+=p3RetailPrice;
			//System.out.println(p3RetailPrice);
			break;
		default:
			break;
		
		}
	   System.out.println("Do you want to continue: yes/no");
	   String c=br.readLine();
		if(c.equals("no"))
		{	System.out.println("Total price: "+total);break;}
			
	   
	}
   
 

}
}
