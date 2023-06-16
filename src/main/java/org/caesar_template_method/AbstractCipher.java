package org.caesar_template_method;

public abstract class AbstractCipher {

    protected static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    protected String message;

    public String execute(int key) {
        StringBuilder hashedMessageBuilder = new StringBuilder();
        char[] charArray = message.toCharArray();
        for (char c : charArray) {
            int letterIndex = AbstractCipher.alphabet.indexOf(c);
            Character newLetter = AbstractCipher.alphabet.charAt(this.calculateLetterIndex(letterIndex, key));
            hashedMessageBuilder.append(newLetter);
        }
        return hashedMessageBuilder.toString();

    }

    protected abstract int calculateLetterIndex(int letterIndex, int key);
}
