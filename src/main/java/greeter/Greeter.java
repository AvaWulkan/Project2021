package greeter;

        import java.time.LocalDateTime;
        import java.time.LocalTime;


public class Greeter {

    public String inputTime;

    public void setTime(String x) {
        inputTime = x;
    }

    public String logToConsole() {
        System.out.println(LocalDateTime.now() + "Function was called with inputTime: " + inputTime);
        return "Logged";
    }

    public String greet(String name) {
        String upperCaseName = name.substring(0, 1).toUpperCase() + name.substring(1);
        logToConsole();

        if (inputTime == null) {
            return "Hello " + upperCaseName.trim();
        }


        // Case 1: Morning time
        LocalTime startMorningTime = LocalTime.parse("06:00:00");
        LocalTime endMorningTime = LocalTime.parse("12:00:00");
        if (LocalTime.parse(inputTime).isBefore(endMorningTime) && LocalTime.parse(inputTime).isAfter(startMorningTime)) {
            return "Good morning " + upperCaseName;
        }

        // Case 2: Evening time
        LocalTime startEveningTime = LocalTime.parse("18:00:00");
        LocalTime endEveningTime = LocalTime.parse("22:00:00");
        if (LocalTime.parse(inputTime).isBefore(endEveningTime) && LocalTime.parse(inputTime).isAfter(startEveningTime)) {
            return "Good evening " + upperCaseName;
        }

        // Case 3: Night time
        LocalTime startNightTime = LocalTime.parse("22:00:00");
        LocalTime endNightTime = LocalTime.parse("06:00:00");
        if (LocalTime.parse(inputTime).isBefore(endNightTime) || LocalTime.parse(inputTime).isAfter(startNightTime)) {
            return "Good night " + upperCaseName;
        }
        return null;
    }

}