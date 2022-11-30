package teamexcersice.hari;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		Set <Integer> ts = new TreeSet<>();
		   ts.add(10);
		   ts.add(22);
		   ts.add(36);
		   ts.add(25);
		   ts.add(16);
		   ts.add(70);
		   ts.add(82);
		   ts.add(89);
		   ts.add(14);
		   System.out.println("Greater than or equal to 86 : "+((TreeSet<Integer>) ts).ceiling(86));
		   System.out.println("Strictly less than 69 : "+ ((TreeSet<Integer>) ts).lower(69));
	}

}
	