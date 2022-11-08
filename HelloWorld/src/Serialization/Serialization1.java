package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public interface Serialization1 {
	public static void main(String[] args) throws IOException {
		data c =new data(100,"y0ga");
		FileOutputStream obj=new FileOutputStream("org.eclipse.core.resources.prefs");
	     @SuppressWarnings("resource")
		ObjectOutputStream cop = new ObjectOutputStream(obj);
			cop.writeObject(c);
			 cop.flush();
			 
				 
			 }
		
}

