package org.caesar_template_method;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = scanner.nextLine();
        System.out.println("Enter your integer key");
        int key = scanner.nextInt();
        CaesarCipher cipher = new CaesarCipher(new CryptMessage(), message);
        String hashedMessage = cipher.execute(key);
        System.out.println(hashedMessage);
        cipher.setCipher(new DecryptMessage());
        String decodedMessage = cipher.execute(key);
        System.out.println(decodedMessage);
    }
}
