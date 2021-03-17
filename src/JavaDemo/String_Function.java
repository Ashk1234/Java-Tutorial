package JavaDemo;

public class String_Function {

	public static void main(String[] args) {
		
		String b = "ram";
		 
        // getBytes() method to convert string
        // into bytes[].
        byte[] a = b.getBytes();
 
        byte[] result = new byte[a.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < a.length; i++)
            result[i] = a[a.length - i - 1];
 
        System.out.println(new String(result));
		
        
		
	
	}
	


	}


