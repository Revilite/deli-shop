
import com.pluralsight.delishop.backend.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        homeScreen();
    }

    public static void homeScreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1) New Order
                0) Exit
                """);
        int userInput = scan.nextInt();
        scan.nextLine();

        if (userInput == 1) {
            orderScreen();
        }
    }

    public static void orderScreen() {
        Scanner scan = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            System.out.println("""
                    1)  Add Sandwich
                    2)  Add Drink
                    3)  Add Chips
                    4)  Checkout
                    0)  Cancel Order
                    """);
            int userInput = scan.nextInt();
            scan.nextLine();


            switch (userInput) {
                case (1):
                    order.addItem(addSandwich());
                    break;
                case (2):
                    order.addItem(addDrink());
                    break;
                case (3):
                    order.addItem(addChips());
                    break;
                case (4):
                    System.out.println(order);
                    break;
                default:
                    System.out.println(order.getTotalPrice());
                    return;
            }


        }
    }

    public static Sandwich addSandwich() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of bread do you want?");
        Sandwich.BreadType breadType = Sandwich.BreadType.valueOf(scan.nextLine());
        System.out.println("What is the size of the sandwich");
        Sandwich.SandwichSize sandwichSize = Sandwich.SandwichSize.valueOf(scan.nextLine());
        System.out.println("Would you like it toasted?");
        String toasted = scan.nextLine();

        Sandwich sandwich = new Sandwich(sandwichSize, toasted.equalsIgnoreCase("Yes") ? true : false, breadType, new ArrayList<>());
        addTopping(sandwich);

        return sandwich;
    }

    public static Drink addDrink() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What size Drink do you want");
        Drink.DrinkSize size = Drink.DrinkSize.valueOf(scan.nextLine());
        System.out.println("What is the name of the drink?");
        String name = scan.nextLine();


        Drink drink = new Drink(size, name);

        return drink;
    }

    public static Chips addChips() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of chips do you want?");
        String name = scan.nextLine();

        Chips chips = new Chips(name);
        return chips;
    }


    public static void addTopping(Sandwich sandwich) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("What topping would you like?");
            Cheese.TypeOfCheese typeOfCheese = Cheese.TypeOfCheese.valueOf(scan.nextLine());
            System.out.println("is there extra?");
            String hasExtra = scan.nextLine();

            sandwich.addTopping(new Cheese(typeOfCheese, sandwich.getSandwichSize(), hasExtra.equalsIgnoreCase("yes") ? true : false));

            System.out.println("Is that all?");
            if (scan.nextLine().equalsIgnoreCase("yes")) {
                return;
            }
        }


    }
}
