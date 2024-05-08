package Ejercicio5;

import java.time.LocalDate;

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(LocalDate time, String message, UserAccount sender, UserAccount receiver) {
        super(time, message, sender);
        this.receiver = receiver;
    }
    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }
    @Override
    public String toString() {
        return "DirectMessage{" +
                "receiver=" + receiver.getAlias() +
                ", time=" + getTime() +
                ", message='" + getMessage() + '\'' +
                ", sender=" + getSender().getAlias() +
                '}';
    }
}





