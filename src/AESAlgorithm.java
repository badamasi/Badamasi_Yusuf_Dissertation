
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class AESAlgorithm {
    //Key in byte
    public static String algo = "AES";
    public byte[] keyValue;
    
    //constructure
    public AESAlgorithm(byte key[]){
        keyValue = key;
        
    }
    // key generation
    public Key generateKey() throws Exception{
        Key key = new SecretKeySpec(keyValue, algo);
        return key;
    }
    
    //ecrypt text message function
    public String encrypt(String msg)throws Exception{
        Key key = generateKey();
        Cipher c = Cipher.getInstance(algo);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(msg.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        
       // return encrypted data 
       return encryptedValue;
    }//end of encryption function 
    
    // function for decrypting message
    public String decrypt(String msg) throws Exception{
        Key key = generateKey();
        Cipher c = Cipher.getInstance(algo);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(msg);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        
        // return decrypted data
        return decryptedValue;
        
    }// end of decryption function
}// end of AES class
