package Ejercicio5;
public class Email {
    private String address;

    public Email(String address) {
        if (!isValidEmail(address)) {
            throw new IllegalArgumentException("El email no es válido");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (!isValidEmail(address)) {
            throw new IllegalArgumentException("El email no es válido");
        }
        this.address = address;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}
