package org.caesar_template_method;

public class DecryptMessage extends AbstractCipher {

    public DecryptMessage() {

    }
    public DecryptMessage(String message) {
        this.message = message;
    }
    @Override
    protected int calculateLetterIndex(int letterIndex, int key) {
        return letterIndex - key % alphabet.length();
    }
}
