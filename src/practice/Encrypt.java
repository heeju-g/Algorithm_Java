package practice;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;





public class Encrypt {
public static void main(String[] args){
        
        /* server code */
        /* Key �߱� */
        PublicKey publicKey = null;    // ����Ű
        PrivateKey privateKey = null;  // ����Ű
         
        SecureRandom secureRandom = new SecureRandom(); // random number generator(RNG) 
         
        try {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA"); // RSA(1024, 2048), DiffieHellman(1024)
        keyPairGenerator.initialize(1024, secureRandom);
        KeyPair keyPair = keyPairGenerator.generateKeyPair(); // generate key pair
         
        publicKey  = keyPair.getPublic();
        privateKey = keyPair.getPrivate();
         
        System.out.println(publicKey.getAlgorithm());
        System.out.println(publicKey.getFormat()); // ����Ű ǥ��
        System.out.println(publicKey.toString());
         
        System.out.println();
         
        System.out.println(privateKey.getAlgorithm());
        System.out.println(privateKey.getFormat()); // ����Ű ǥ��
        System.out.println(privateKey.toString());
         
         
        String publicKeyStr = Base64.getEncoder().encodeToString(publicKey.getEncoded());   // Base64 ���ڵ�
        String privateKeyStr = Base64.getEncoder().encodeToString(privateKey.getEncoded()); // Base64 ���ڵ�
        System.out.println(privateKeyStr);
         
         
        } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        } 
         
        /* Ű�߱� ���� */
         
        /* client code */
        String plainText = "hello world!";
        String encryptedText = "";
        String decryptedText = "";
         
        try {
        Cipher cipher = Cipher.getInstance("RSA");
         
        // ����Ű �̿� ���ڼ���
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        encryptedText = Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes()));
        System.out.println("****encrypt****");
        System.out.println(encryptedText);
        System.out.println("****decrypt****");
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
         
        // ����Ű �̿� ��ȣȭ
        decryptedText = new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText.getBytes())));
        System.out.println(decryptedText);
         
         
         
        } catch (NoSuchAlgorithmException | NoSuchPaddingException |InvalidKeyException |IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
}
}
