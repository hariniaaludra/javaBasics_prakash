package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedHashMap1 {
	    public static void main(String[] args) {
	        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        numbers.put("four", 4);
	        numbers.put("five", 5);
	        numbers.put("six", 6);
	        numbers.put("seven",7);
	        numbers.put("eight", 8);
	        
	        System.out.println("LinkedHashMap: " + numbers);

	        System.out.println("Key/Value mappings: " + numbers.entrySet());
	        
	          Iterator<Entry<String, Integer>> c=numbers.entrySet().iterator();
            while(c.hasNext())
            {
            	
	   System.out.println(c.next());
             }
	     System.out.println("Keys: " + numbers.keySet());
	     
	        System.out.println("Values: " + numbers.values());
	               
	                int value = numbers.remove("Two");
	                System.out.println("Removed value: " + value);

	              
	                boolean result = numbers.remove("Three", 3);
	                System.out.println("Is the entry Three removed " + result);

	                System.out.println("Updated LinkedHashMap: " + numbers);
	            }
	        }

	    
	



