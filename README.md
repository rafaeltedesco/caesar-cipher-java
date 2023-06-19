# Caesar Cipher using Template Method and Strategy Design Patterns
This repository contains a Java implementation of the Caesar Cipher encryption and decryption algorithm using the Template Method and Strategy design patterns.

The Caesar Cipher is a simple substitution cipher where each letter in the plaintext is shifted a certain number of positions down the alphabet. The Template Method design pattern is used to define the overall structure of the cipher algorithm while allowing subclasses to provide their own implementation details. In addition, the Strategy design pattern is used to encapsulate different encryption and decryption strategies.

## Usage
Clone the repository:

Open the project in your preferred Java IDE.

Locate the org.caesar_template_method.App class and run it.

The program will prompt you to enter a message and an integer key.

The message will be encrypted using the Caesar Cipher algorithm and printed to the console.

The encrypted message will then be decrypted using the same key and printed to the console.

## Project Structure
The project follows the following package structure:

org.caesar_template_method: Contains the main classes and interfaces for the Caesar Cipher implementation.

AbstractCipher: An abstract class that defines the template method execute() for the encryption and decryption process. Subclasses provide their own implementation of the calculateLetterIndex() method.

CryptMessage and DecryptMessage: Concrete subclasses of AbstractCipher that implement the encryption and decryption algorithms using the Caesar Cipher.

CaesarCipher: A class that acts as a context for the encryption and decryption strategies. It accepts different strategies through constructor injection.

App: The entry point of the program, which takes user input and demonstrates the usage of the Caesar Cipher.

## Contributing
Contributions to this project are welcome! If you have any ideas, suggestions, or bug reports, please open an issue or submit a pull request.
