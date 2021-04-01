package greeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GreeterTest {

    @Test
    void testNameInput() {
        Greeter greeter = new Greeter();
        var result = greeter.greet("Benny");
        Assertions.assertEquals("Hello " + "Benny", result);
    }

    @Test
    void testNameInputWithTrim() {
        Greeter greeter = new Greeter();
        var result = greeter.greet("Benny                    ");
        Assertions.assertEquals("Hello " + "Benny", result);
    }

    @Test
    void capitalizeFirstLetterInName() {
        Greeter greeter = new Greeter();
        var result = greeter.greet("benny");
        Assertions.assertEquals("Hello " + "Benny", result);
    }

    @Test
    void timeIsBetween6and12() {
        Greeter greeter = new Greeter();
        greeter.setTime("07:00:00");
        var result = greeter.greet("Bob");
        Assertions.assertEquals("Good morning " + "Bob", result);
    }



    @Test
    void timeIsBetween18and22() {
        Greeter greeter = new Greeter();
        greeter.setTime("19:00:00");
        var result = greeter.greet("Bob");
        Assertions.assertEquals("Good evening " + "Bob", result);
    }

    @Test
    void timeIsBetween22and06() {
        Greeter greeter = new Greeter();
        greeter.setTime("01:00:00");
        var result = greeter.greet("Bob");
        Assertions.assertEquals("Good night " + "Bob", result);
    }

    @Test
    void logsIntoConsole() {
        Greeter greeter = new Greeter();
        greeter.setTime("01:01:01");
        var result = greeter.logToConsole();
        Assertions.assertEquals("Logged", result);
    }
}