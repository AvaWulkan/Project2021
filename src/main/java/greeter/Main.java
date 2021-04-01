package greeter;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {


    // Commitar och uppdaterar för att kunna aktivera inlogg till Avas server (Ola).
    public static void main(String[] args) {
        Greeter greeting = new Greeter();
        greeting.setTime(LocalTime.now().toString());
        var x = greeting.greet("Herr Blomberg");
        System.out.println(x);
    }

}
