package collectionpractice;
import java.util.*;  
public class ArrayList4{  
	 public static void main(String[] args){  
	    ArrayList<String> List=new ArrayList<String>();  
	           List.add("Ravi");  
	           List.add("Vijay");  
	           List.add("Ravi");  
	           List.add("Ajay");  
	           
	            
	           System.out.println("Traversing list through List Iterator:");  
	             
	            ListIterator<String> list1= List.listIterator(List.size());  
	             while(list1.hasPrevious())  
	              {  
	                  System.out.println(list1.previous());  
	                   
	            
	              
	              }  
	        System.out.println("Traversing list through for loop:");  
	           for(int i=0;i<List.size();i++)  
	           {  
	            System.out.println(List.get(i));     
	           }  
	              
	        System.out.println("Traversing list through forEach() method:");  
	    
	            for(String c:List) {
	            	System.out.println(c);
	            }
	                
	          
	 }  
}
	


