package crm.libraries.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializer {
	
	public static byte[] objectToByteArray(Object o) throws IOException{
    	ByteArrayOutputStream baOut = new ByteArrayOutputStream();
    	ObjectOutputStream objOut = new ObjectOutputStream(baOut);
    	
    	objOut.writeObject(o);
    	byte[] result = baOut.toByteArray();
    	
    	objOut.close();
    	
    	return result;
    }
    
    public static Object byteArrayToObject(byte[] s) throws IOException,
    ClassNotFoundException{
    	ByteArrayInputStream baIn = new ByteArrayInputStream(s);
    	ObjectInputStream objIn = new ObjectInputStream(baIn);
    	
    	Object o = objIn.readObject();
    	
    	objIn.close();
    	
    	return o;
    }
	
}