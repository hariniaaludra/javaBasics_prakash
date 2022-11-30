package arraylistconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	public void name() {
		
		ArrayList<String> ner = new ArrayList<>();
		ner.add("akshat");
		ner.add("arun");
		ner.add("syed");
		ner.add("noobie");
		ner.add("dev");
		ner.add("ram");
		ner.add("akash");
		ner.add("vimal");
		ner.add("kamalesh");
		ner.add("rahul");
		System.out.println("Ascending order:");
		Collections.sort(ner);
		
		for (String c : ner) {
			System.out.println(c);
		}
		
		System.out.print("* * * * *");
		System.out.println("Decending order:");
		Collections.sort(ner, Collections.reverseOrder());
		
		for (String u : ner) {
			System.out.println(u);
		}
		
		System.out.print("* * * * *");
		System.out.print("\nStarting With " + "A" + " name: ");
		System.out.print("\n");
		for (String i : ner) {
			if (i.startsWith("a")) {
				System.out.println( i + " ");
			}
		}
		System.out.print("* * * * *");
	}

	public void number() {
		
		List<Integer> cer = new ArrayList<>();
		cer.add(111);
		cer.add(112);
		cer.add(113);
		cer.add(114);
		cer.add(115);
		cer.add(116);
		cer.add(117);
		cer.add(118);
		cer.add(119);
		cer.add(120);
		System.out.println("Ascending order:");
		Collections.sort(cer);
		
		for (Integer c : cer) {
			System.out.println(c);
		}
		
		System.out.print("* * * * *");
		System.out.println("Decending order:");
		Collections.sort(cer, Collections.reverseOrder());
		for (Integer o : cer) {
			System.out.println(o);
		}
		
		System.out.print("* * * * *");
		System.out.println("Even Numers:");
		for (Integer i : cer) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		
		System.out.print("* * * * *");
		System.out.println("odd numbers:");
		for (Integer i : cer) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
		System.out.print("* * * * *");
	}
}
