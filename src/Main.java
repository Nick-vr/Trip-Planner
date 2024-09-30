import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vacation Planner!");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Nice to meet you " + name + ", where are you travelling to?");
        String travellingTo = input.next();
        System.out.println("Great! " + travellingTo + " sounds like a great trip!");
        System.out.println("********************");
    }
}
