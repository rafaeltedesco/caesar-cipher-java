package org.caesar_template_method;

public class App 
{
    public static void main( String[] args )
    {
        String message = "hello";
        AbstractCipher cryptMessage = new CryptMessage(message);
        String hashedMessage = cryptMessage.execute(10);
        System.out.println(hashedMessage);
        AbstractCipher decryptMessage = new DecryptMessage(hashedMessage);
        String decodedMessage = decryptMessage.execute(10);
        System.out.println(decodedMessage);
    }
}
