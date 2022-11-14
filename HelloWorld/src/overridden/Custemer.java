package overridden;

class Custemer {
	int payment() {
		System.out.println("collect the all custemer data");
		@SuppressWarnings("unused")
		class Bank extends Custemer{
			@Override
			int payment() {
				System.out.println("QR code");
			class GooglePay	extends Custemer{
				//int a;
				@Override
	              int payment() {
					System.out.println("share the payment");
					return 0;

					
				}
			}
			return 0;
				
			}

				
			}
		return 0;
		}
}