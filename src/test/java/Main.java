
import com.pluralsight.delishop.backend.Cheese;
import com.pluralsight.delishop.backend.Order;
import com.pluralsight.delishop.backend.Sandwich;
import com.pluralsight.delishop.backend.inventory.BreadType;
import com.pluralsight.delishop.backend.inventory.TypeOfCheese;
import com.pluralsight.delishop.backend.inventory.SandwichSize;

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
                    order.addSandwich(addSandwich());
                    break;
                case (2):
                    addDrink();
                    break;
                case (3):
                    addChips();
                    break;
                case (4):
                    checkout();
                    break;
                default:
                    System.out.println(order.printOrder());
                    return;
            }


        }
    }

    public static Sandwich addSandwich() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of bread do you want?");
        BreadType breadType = BreadType.valueOf(scan.nextLine());
        System.out.println("What is the size of the sandwich");
        SandwichSize sandwichSize = SandwichSize.valueOf(scan.nextLine());
        System.out.println("Would you like it toasted?");
        String toasted = scan.nextLine();

        Sandwich sandwich = new Sandwich(sandwichSize, toasted.equalsIgnoreCase("Yes") ? true : false, breadType);
        addTopping(sandwich);

        return sandwich;
    }

    public static void addDrink() {

    }

    public static void addChips() {

    }

    public static void checkout() {

    }

    public static void addTopping(Sandwich sandwich) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("What topping would you like?");
            TypeOfCheese typeOfCheese = TypeOfCheese.valueOf(scan.nextLine());
            System.out.println("is there extra?");
            String hasExtra = scan.nextLine();

            sandwich.addTopping(new Cheese(hasExtra.equalsIgnoreCase("yes") ? true : false, sandwich.getSandwichSize(), typeOfCheese));

            System.out.println("Is that all?");
            if (scan.nextLine().equalsIgnoreCase("yes")) {
                return;
            }
        }


    }
}
