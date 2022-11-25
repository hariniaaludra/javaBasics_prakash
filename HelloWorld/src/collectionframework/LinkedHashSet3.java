package collectionframework;

import java.util.*;  

public class LinkedHashSet3   
{  
 
public static void main(String[] args)  
{  
  
LinkedHashSet
<String> lhs = new LinkedHashSet<>();  
 
lhs.add("Java");  
lhs.add("T");  
lhs.add("Point");  
lhs.add("Good");  
lhs.add("Website");  

System.out.println("The hash set is: " + lhs);  
  
// Removing an element from the above linked Set  
  
// since the element "Good" is present, therefore, the method remove()  
// returns true  
System.out.println(lhs.remove("Good"));  
  
// After removing the element  
System.out.println("After removing the element, the hash set is: " + lhs);  
  
// since the element "For" is not present, therefore, the method remove()  
// returns false  
System.out.println(lhs.remove("For"));  
  
}  
}  


