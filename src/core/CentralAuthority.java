package core;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class CentralAuthority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralAuthority c=new CentralAuthority();
		KeyPair k=c.generateKeyPair();
	//	System.out.println("Private key "+k.getPrivate());
		//System.out.println("Public Key "+k.getPublic());

	}

	public KeyPair generateKeyPair()
	{
		KeyPair keys=null;
		try {
			 keys = KeyPairGenerator.getInstance("RSA").generateKeyPair();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return keys;
		
		//Cipher cipher = Cipher.getInstance("RSA");
		

	}

}
