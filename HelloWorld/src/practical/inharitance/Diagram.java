package practical.inharitance;

public class Diagram {
	public static void main(String[] args) {
		Square square=new Square();
		System.out.println("squareArea:"+square.squareArea(2.0));
		System.out.println("squarePerimeter:"+square.squareperiMeter(2.45));
		Circle circle=new Circle();
		System.out.println("circleArea:"+circle.circleArea(4.34));
		System.out.println("circlePeriMeter:"+circle.circleperiMeter(2.41));
	}
	
	

}