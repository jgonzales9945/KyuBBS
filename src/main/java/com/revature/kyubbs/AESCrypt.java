package com.revature.kyubbs;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESCrypt {
	
	private static final String ALGORITHM = "AES";
	private static final String KEY = "1Hbfh667adfDEJ78";
	private static  Base64.Encoder encoder = Base64.getEncoder();
	private static Base64.Decoder decoder = Base64.getDecoder();
	
	public static String encrypt(String value) throws Exception {
		
		Key key = generateKey();
	    Cipher cipher = Cipher.getInstance(AESCrypt.ALGORITHM);
	    cipher.init(Cipher.ENCRYPT_MODE, key);
	    byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
	    String encryptedValue64 = encoder.encodeToString(encryptedByteValue);
	    return encryptedValue64;
	}
	 
	public static String decrypt(String value) throws Exception {
		
		Key key = generateKey();
	    Cipher cipher = Cipher.getInstance(AESCrypt.ALGORITHM);
	    cipher.init(Cipher.DECRYPT_MODE, key);
	    byte [] decryptedValue64 = decoder.decode(value);
	    byte [] decryptedByteValue = cipher.doFinal(decryptedValue64);
	    String decryptedValue = new String(decryptedByteValue,"utf-8");
	    return decryptedValue;
	}
	    
	private static Key generateKey() throws Exception {
		
		Key key = new SecretKeySpec(AESCrypt.KEY.getBytes(),AESCrypt.ALGORITHM);
	    return key;
	}
}
