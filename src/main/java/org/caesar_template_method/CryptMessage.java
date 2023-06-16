package org.caesar_template_method;

public class CryptMessage extends AbstractCipher {

    public CryptMessage() {

    }
    public CryptMessage(String message) {
        this.message = message;
    }
    @Override
    protected int calculateLetterIndex(int letterIndex, int key) {
        return letterIndex + key % alphabet.length();
    }
}
