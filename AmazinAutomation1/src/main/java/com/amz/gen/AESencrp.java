//package com.amz.gen;
//
//import java.security.Key;
//
//import javax.crypto.Cipher;
//import javax.crypto.spec.SecretKeySpec;
//
//
//
//public class AESencrp {
//    
//     private static final String ALGO = "AES";
//     private static final byte[] keyValue = new byte[] { 'I', 'V', 'S', 'T', 'C', 'O', 'N','S', 'U', 'L', 'T','I', 'N', 'G', 'P', 'L' };
//
//
//    public static String encrypt(String Data) throws Exception {
//        Key key = generateKey();
//        Cipher c = Cipher.getInstance(ALGO);
//        c.init(Cipher.ENCRYPT_MODE, key);
//        byte[] encVal = c.doFinal(Data.getBytes());
//        String encryptedValue = new BASE64Encoder().encode(encVal);
//        return encryptedValue;
//    }
//    public static String decrypt(String encryptedData) throws Exception {
//        Key key = generateKey();
//        Cipher c = Cipher.getInstance(ALGO);
//        c.init(Cipher.DECRYPT_MODE, key);
//        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
//        byte[] decValue = c.doFinal(decordedValue);
//        String decryptedValue = new String(decValue);
//        return decryptedValue;
//    }
//    private static Key generateKey() throws Exception {
//        Key key = new SecretKeySpec(keyValue, ALGO);
//        return key;
//    }
//
//    public static void main(String arg[]){
//    	String pass="123456789";
//    	
//    	String decpass = "";
//		try {
//			decpass = AESencrp.encrypt(pass);
//			System.out.println("My Encrypt pass:"+decpass);
//			System.out.println("Decrypt pass:"+AESencrp.decrypt(decpass));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			AppLogHandler.appLog.info(e.getMessage(),e);
//		}
//    	
//    }
//}
//
//
//
