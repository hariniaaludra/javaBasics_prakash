 
		package practiceEx;                                                       
		import java.io.*;                                                         
		import java.util.*;                                                       
		 public class  Serialization1 {                                                      
		public static void main(String[] args)                                    
		        {                                                                 
		          ArrayList<String> al=new ArrayList<String>();                   
		          al.add("Ravi");                                                 
		          al.add("Vijay");                                                
		          al.add("Ajay");                                                 
		                                                                          
		          try                                                             
		          {                                                               
		                                                                          
		              FileOutputStream fos=new FileOutputStream("file");          
		              ObjectOutputStream oos=new ObjectOutputStream(fos);         
		              oos.writeObject(al);                                        
		              oos.flush();                                                
		              FileInputStream fis=new FileInputStream("file");            
		              ObjectInputStream ois=new ObjectInputStream(fis);           
		            ArrayList<String>  list=(ArrayList<String>)ois.readObject();  
		            System.out.println(list);                                     
		          }catch(Exception e)                                             
		          {                                                               
		              System.out.println("Outpur is noobb");                      
		          }                                                               
		       }                                                                  
		                                                                         
		                                                                          
		                                                                          
		                                                                 
	}


