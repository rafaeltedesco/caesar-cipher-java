package org.caesar_template_method;

public abstract class AbstractCipher {

    protected static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz _--";
    protected String message;

    public String execute(int key) {
        boolean wasIndexNotFound = false;
        StringBuilder hashedMessageBuilder = new StringBuilder();
        char[] charArray = message.toCharArray();
        for (char c : charArray) {
            int letterIndex = AbstractCipher.alphabet.indexOf(c);
            if (letterIndex == -1) {
                wasIndexNotFound = true;
                break;
            }
            Character newLetter = AbstractCipher.alphabet.charAt(this.calculateLetterIndex(letterIndex, key));
            hashedMessageBuilder.append(newLetter);
        }
        if (wasIndexNotFound) {
            System.out.println("Invalid character");
            System.exit(1);
        }
        return hashedMessageBuilder.toString();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    protected abstract int calculateLetterIndex(int letterIndex, int key);
}
