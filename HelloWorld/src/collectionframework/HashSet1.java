package collectionframework;
import java.util.*;  
class HashSet1{  
	 public static void main(String[] args)
	 {  
	   ArrayList<String> list=new ArrayList<>();  
	           list.add("Ravi");  
	           list.add("Vijay");  
	           list.add("Ajay");  
	             
	           HashSet<String> set=new HashSet<String>(list);  
	           set.add("Gaurav");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  
	}  
