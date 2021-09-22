package examples;

public class HeightMain {
public static void main(String[] args) {
	Height h=new Height();
	h.display();
	Height h1=new Height(12,35);
	Height h2=new Height(12);
	h1.display();
	h2.display();
	Height sumHeight=h1.sumFeet(h2);
	sumHeight.display();
}
}
