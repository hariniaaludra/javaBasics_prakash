package collectionpractice;
import java.util.*;  
public class ArrayList4{  
	 public static void main(String[] args){  
	    ArrayList<String> list=new ArrayList<>();  
	           list.add("Ravi");  
	           list.add("Vijay");  
	           list.add("Ravi");  
	           list.add("Ajay");  
	           
	            
	           System.out.println("Traversing list through List Iterator:");  
	             
	            ListIterator<String> list1= list.listIterator(list.size());  
	             while(list1.hasPrevious())  
	              {  
	                  System.out.println(list1.previous());  
	                   
	            
	              
	              }  
	        System.out.println("Traversing list through for loop:");  
	           for(int i=0;i<list.size();i++)  
	           {  
	            System.out.println(list.get(i));     
	           }  
	              
	        System.out.println("Traversing list through forEach() method:");  
	    
	            for(String c:list) {
	            	System.out.println(c);
	            }
	                
	          
	 }  
}
	


