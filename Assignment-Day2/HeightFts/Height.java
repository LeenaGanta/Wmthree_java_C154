package examples;

/*
 * Create a Height class, which represents height in feet and inches, create multiple constructors on different scope and make sure constructor store feet and inches in proper values amd create method to add two height objects too.
1 feet = 12 inches

 */
public class Height 
{
 private int feet,inches;
 public Height(int feet,int inches)
 {
	 this.feet=feet+inches/12;
	 this.inches=inches%12;
 }
 
 /*private Height(int feet)
 {
	 this.feet=feet;
	 this.inches=0;
 }*/
 
 Height(int feet)
 {
	 this.feet=feet;
	 this.inches=0;
 }
 Height()
 {
	feet=6;
	inches=6;
 }
 public void display() {
			    System.out.print(feet+"Ft.");
			    System.out.println(" "+inches+"inches");
			
	}
 
 public Height sumFeet(Height h1)
 {
	 Height h=new Height();
		h.feet=feet+h1.feet;
		h.inches=inches+h1.inches;
		return h;
 }
}
