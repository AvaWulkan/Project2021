package greeter;

public class Main {

    public static void main(String[] args) {
        Greeter greeting = new Greeter();
        var x = greeting.greet("Herr Blomberg");
        System.out.println(x);
    }

}
