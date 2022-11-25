package collectionframework;

import java.util.Map;
import java.util.TreeMap;
 class TreeMap1 {    
		 public static void main(String[] args) {    
		    
		     Map<Integer,Book> map=new TreeMap<>();    
		    
		     Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		     Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		     Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
		    
		     map.put(2,b2);  
		     map.put(1,b1);  
		     map.put(3,b3);  
		       
		    
		     for(Map.Entry<Integer, Book> entry:map.entrySet()){    
		         int key=entry.getKey();  
		         Book b=entry.getValue();  
		         System.out.println(key+" Details:");  
		         System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		     }
	   TreeMap<Integer,String> map1=new TreeMap<>();    
	      map1.put(100,"Amit");    
	      
	      map1.put(102,"Ravi");
	      
	      map1.put(101,"Vijay");    
	      map1.put(103,"Rahul");    
	   
	      System.out.println("headMap: "+map1.headMap(102));  
	 
	      System.out.println("tailMap: "+map1.tailMap(102));  
	    
	      System.out.println("subMap: "+map1.subMap(100, 102));    
	 
}
		 }


