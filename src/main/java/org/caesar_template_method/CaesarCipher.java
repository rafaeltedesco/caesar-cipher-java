package org.caesar_template_method;

public class CaesarCipher {

    private AbstractCipher cipher;
    private String message;
    public CaesarCipher(AbstractCipher cipher, String message) {
        this.cipher = cipher;
        this.cipher.setMessage(message);
    }

    public String execute(int key) {
        message = cipher.execute(key);
        return message;
    }

    public void setCipher(AbstractCipher cipher) {
        this.cipher = cipher;
        this.cipher.setMessage(message);
    }

}
