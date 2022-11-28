package glad;

import java.util.Scanner;

public interface World {
	 public State world();

}
class Citys implements World{
	
public State world() {
	System.out.println("Enter the value:");
	Scanner cer=new Scanner(System.in);
	int m=cer.nextInt();
			for(State sea:State.values()) {
		          if(sea.ordinal()==m) {
		        	  return sea;
		          }
		         
			}
	
cer.close();
			return null;

		}
 }

 
enum State{
  	  INDIA,UK,US,EUROPE,AUS;
	 }
 
 
