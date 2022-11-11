package switchk;

public class switchcase {
  public static void main(String[] args) {
	  
	int a=3;
	int b =2;
switch(a){
case 1:
	System.out.println("one");
	break;
case 2:
	System.out.println("two");
	break;
case 3:
	System.out.println("inner case");
	switch(b){
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		
	break;
case 4:
	System.out.println("four");
	break;
	default:
		System.out.println("other numbers");

}
}
}
}