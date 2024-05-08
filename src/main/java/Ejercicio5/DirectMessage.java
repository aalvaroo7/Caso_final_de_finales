package Ejercicio5;

import java.time.LocalDate;

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(LocalDate time, String message, UserAccount sender, UserAccount receiver) {
        super(time, message, sender);
        this.receiver = receiver;
    }
}

// Métodos de acceso y modificación (getters y setters)
// Implementación del método toString()
