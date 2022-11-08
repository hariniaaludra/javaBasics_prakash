package Overridden;

public class Custemer {
	void payment(int amount) {
		System.out.println("collect the all custemer data");
		@SuppressWarnings("unused")
		class Bank extends Custemer{
			void payment(int amount) {
				System.out.println("QR code");
			class GooglePay	extends Bank{
				void payment(int amount,int  bill) {
					System.out.println("share the payment");

					
				}
			}
				
			}
		}
	}
}
	
