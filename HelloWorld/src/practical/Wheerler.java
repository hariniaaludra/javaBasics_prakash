package practical;

    class Vehicle {

		  double basePrice = 100000;

		  public void showPrice() {
		    System.out.println("The price of Vehicle is: Rs." + basePrice);
		  }
		}

	
		class TwoWheeler extends Vehicle {

		  double increasePriceBy = 0.20;

		  void finalPrice() {
		    basePrice = basePrice + (basePrice * increasePriceBy);
		    
		  }
		}

		
		class FourWheeler extends Vehicle {

		  double increasePriceBy = 1;

		  void finalPrice() {
		    basePrice = basePrice + (basePrice * increasePriceBy);
		    System.out.println(basePrice);
		   
		  }
		}

		public class Wheerler {

		  public static void main(String[] args) {
		   
		    TwoWheeler bike = new TwoWheeler();
		  
		    FourWheeler car = new FourWheeler();

		       bike.showPrice();
		       bike.finalPrice();

		    car.showPrice();
		    car.finalPrice();
		  }
		}


