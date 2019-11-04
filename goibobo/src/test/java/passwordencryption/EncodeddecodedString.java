package passwordencryption;

import org.apache.commons.codec.binary.Base64;

public class EncodeddecodedString {

	public static void main(String[] args) {

		String s= "Pass@12345";
		//Here we are encoding the string into ase 64
		byte[] encodeString =Base64.encodeBase64(s.getBytes());

		System.out.println("Encode String is"+new String(encodeString));
		
		
		//now we are decoding the string in the decoded format
		
		byte[] decodeString=	Base64.decodeBase64(encodeString);
		
		System.out.println("decoded String is "+new String(decodeString));
	}

}
