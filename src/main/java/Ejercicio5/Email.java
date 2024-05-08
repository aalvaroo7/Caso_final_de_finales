package Ejercicio5;

public class Email {
    private String address;

    public Email(String address) {
        if (!isValidEmail(address)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
