/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maildetection;

/**
 *
 * @author Saurabh
 */
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TripleDES {

    public String encrypt(String message,String Key) throws Exception {
        String keyString =Key; 
        byte[] keyB = new byte[24]; 
        for (int i = 0; i < keyString.length() && i < keyB.length; i++) 
        {
            keyB[i] = (byte) keyString.charAt(i);
        }


        final SecretKey key = new SecretKeySpec(keyB, "DESede");
        final IvParameterSpec iv = new IvParameterSpec(new byte[8]);
        final Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);

        final byte[] plainTextBytes = message.getBytes("utf-8");
        final byte[] cipherText = cipher.doFinal(plainTextBytes);
         final String encodedCipherText = new sun.misc.BASE64Encoder()
         .encode(plainTextBytes);

        return encodedCipherText;
    }

    public String decrypt(String message,String Key) throws Exception {
        String keyString =Key; 
        byte[] keyB = new byte[24]; 
        for (int i = 0; i < keyString.length() && i < keyB.length; i++) 
        {
            keyB[i] = (byte) keyString.charAt(i);
        }

        final SecretKey key = new SecretKeySpec(keyB, "DESede");
        final IvParameterSpec iv = new IvParameterSpec(new byte[8]);
        final Cipher decipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        decipher.init(Cipher.DECRYPT_MODE, key, iv);

         final byte[] encData = new
         sun.misc.BASE64Decoder().decodeBuffer(message);
        return new String(encData);
    }
}

