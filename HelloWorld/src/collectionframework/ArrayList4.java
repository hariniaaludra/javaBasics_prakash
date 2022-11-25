package collectionframework;
import java.util.*;  
public class ArrayList4{  
	 public static void main(String[] args){  
	        System.out.println("enter the ArrayList input value:");
	        ArrayList<Integer> list=new ArrayList<>();  
	        Scanner input=new Scanner(System.in);
	        int c=input.nextInt();
	        for(int i=0;i<c;i++) {
	        	list.add(input.nextInt());
	        }
	          
	           
	            
	           System.out.println("Traversing list through List Iterator:"+list);  
	             
	            ListIterator<Integer> list1= list.listIterator(list.size());
	             while(list1.hasPrevious())  
	              {  
	                  System.out.println(list1.previous());  
	                   
	            
	              
	              }  
//	        System.out.println("Traversing list through for loop:");  
//	           for(int i=0;i<list.size();i++)  
//	           {  
//	            System.out.println(list.get(i));     
//	           }  
//	              
//	        System.out.println("Traversing list through forEach() method:");  
//	    
//	            for(String c:list) {
//	            	System.out.println(c);
//	            }
//	                
	             input.close();
	          
	 }  
}
	


