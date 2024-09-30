import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream (keyboard)
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to vacation Planner!");

        System.out.println("What is your name?");
        String name = input.next(); // Read the user's name from the input
        System.out.println("Nice to meet you " + name + ", where are you travelling to?");

        String travellingTo = input.next(); // Read the destination the user is travelling to from the input  
        System.out.println("Great! " + travellingTo + " sounds like a great trip!");

        System.out.println("******************** \n");

        System.out.println("How many days are you going to spend travelling?");
        int amountOfDaysTravelling = input.nextInt();
        int amountOfDaysTravellingInHours = TravelCalculations.daysIntoHours(amountOfDaysTravelling);
        int amountOfDaysTravellingInMinutes = TravelCalculations.daysIntoMinutes(amountOfDaysTravelling);

        System.out.println("How much money, in EUR, are you planning to spend on your trip?");
        double amountOfMoneyToSpend = input.nextDouble();
        double amountOfMoneyToSpendPerDay = amountOfMoneyToSpend / amountOfDaysTravelling;

        System.out.println("What is the three letter currency symbol for your travel destination?");
        String currency = input.next();

        System.out.println("How many " + currency + " are there in 1 EUR?");
        double currencyConversionAmount = input.nextDouble();
        double euroToChosenCurrency = 1 * currencyConversionAmount;

        System.out.println(
                "If you are travelling for " + amountOfDaysTravelling +
                " days that is the same as " + amountOfDaysTravellingInHours +
                " hours or " + amountOfDaysTravellingInMinutes + " minutes");

        System.out.println("If you are going to spend €" + amountOfMoneyToSpend +
                " that means per day you can spend up to €" + amountOfMoneyToSpendPerDay);

        System.out.println("Your total budget in " + currency + " is " + (euroToChosenCurrency * amountOfMoneyToSpend) + " ,which per day is " + (euroToChosenCurrency * amountOfMoneyToSpend / amountOfDaysTravelling));

        System.out.println("******************** \n");
    }
}
