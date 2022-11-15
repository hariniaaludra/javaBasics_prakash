package practical;

public class Vehicle1{ 
		 
		  void run(){
			  System.out.println("Vehicle is running");
			  }  
		} 
		class Bike2 extends Vehicle1{  
		  
		  @Override
		  void run(){
			  System.out.println("Bike is running safely");
			  }  
		  
		  public static void main(String[] args){  
		  Vehicle1 obj = new Vehicle1(); 
		  obj.run(); 
		  }  
		}  


