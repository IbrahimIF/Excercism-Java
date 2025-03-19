public class Greeter {
    public String getGreeting() {
        return "Hel, World!";
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
    }
}