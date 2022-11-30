package teamexcersice.saranya;
public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer c=new StringBuffer("Syghuj");
		System.out.println(c.capacity());
		
		System.out.println(c.replace(1,3,"Java"));  
		System.out.println(c.insert(1,"Java"));
		System.out.println(c.append("Java"));
		System.out.println(c.delete(1,3));
		System.out.println(c.reverse());  
	     c.ensureCapacity(100);
		System.out.println(c.capacity());

	
	}

}
