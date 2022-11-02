package com.operator.value;
public class operator1 {

	public static void main(String[] args) {
	
		@SuppressWarnings("unused")
		int i=30;
		int j=10;
		System.out.println(i+j);
		System.out.println(i-j); 
		System.out.println(i*j);
		System.out.println(j%i);
		System.out.println(j/i);
		System.out.println(i>>j);//right shift means divition the j value
		System.out.println(i<<j);//left shift means multiplication  the j value 
		System.out.println(i>j&&i<j);
		System.out.println(i<j||i>j);
		 i+=10;//assignment operator
		
	}
	

}
