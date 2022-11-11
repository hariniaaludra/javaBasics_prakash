package practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DecendingOrder {    
    public  void loopOne() {
    	Scanner Array=new Scanner(System.in);
    	System.out.print("enter the number:");
         int [] arr = new int [Array.nextInt()] ;
        int temp = 0;      
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            arr[i]=Array.nextInt();   
        }
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
        System.out.println();
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } 
        Array.close();
    }
   
    	public void array1() {  
        
        Integer[] array = { 1, 2, 3, 6, 5 };
  
        
        Arrays.sort(array, Collections.reverseOrder());
  
    
        System.out.println(Arrays.toString(array));
    }


        public static void main(String[] args) {
        	DecendingOrder ser=new DecendingOrder();
        	ser.loopOne();
        	ser.array1();
    } 
       
}