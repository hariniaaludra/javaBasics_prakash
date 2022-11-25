package collectionframework;
import java.util.*;  
public class LinkedList1 {  
  
        public static void main(String [] args)  
        {  
           LinkedList<String> ll=new LinkedList<>();  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           ll.add("Anuj");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Virat");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Amit"); 
          
           for(int i1=0;i1<ll.size();i1++)  
          {  
            System.out.println(ll.get(i1));     
           }  
           System.out.println("Initial list of elements: "+ll);    
              ll.remove("Vijay"); //object 
              System.out.println("After invoking remove(object) method: "+ll);   
              ll.remove(0);  //index
              System.out.println("After invoking remove(index) method: "+ll);   
              LinkedList<String> ll2=new LinkedList<>();  
              
              ll2.add("Ravi");  
              ll2.add("Hanumat");  
      
              ll.addAll(ll2);  
              System.out.println("Updated list : "+ll);   
       
              ll.removeAll(ll2);  
              System.out.println("After invoking removeAll() method: "+ll);   
              ll.clear();  
              System.out.println("After invoking clear() method: "+ll);   
       }  
    }                   
