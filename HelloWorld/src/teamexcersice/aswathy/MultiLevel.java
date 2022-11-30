package teamexcersice.aswathy;

public class MultiLevel {
	
	    void salary() {
	        System.out.println("Salary= 200000");
	    }
	}

	class Emplayee extends MultiLevel { 

	    void bonus() {
	        System.out.println("Bonus=50000");
	    }
	}

    class Programmer extends Emplayee{
    	 void tips() {
 	        System.out.println("tips=50000");
    	
    }

	class Inheritance1 {
	    public static void main(String[] args) {
	    	 Programmer  p = new  Programmer ();
	        p.salary(); 
	        p.bonus(); 
	        p.tips();
	    }
	}
    }

