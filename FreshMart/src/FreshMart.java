import java.util.ArrayList;
import java.util.Scanner;

public class FreshMart {
    public static void main(String[] args) {
        GroceryItem[] inventory = {
            new Snacks("Salty Chips", 1.50, 200),
            new Snacks("Sweet Cookies", 2.50, 300),
            new Snacks("Spicy Nuts", 3.00, 250),
            new FrozenTreats("Ice Cream", 4.00, 500),
            new FrozenTreats("Frozen Yogurt", 3.50, 400),
            new FrozenTreats("Frozen Popcicle", 2.50, 350),
            new Drinks("Soda", 1.00, 100),
            new Drinks("Juice", 1.50, 120),
            new Drinks("Water Pack (6)", 0.50, 80),
            new Drinks("Root Beer", 2.00, 150),
            new PreparedFood("Hot Dog", 3.00, 250),
            new PreparedFood("Pizza Slice", 2.50, 300),
            new PreparedFood("Peanuts", 4.00, 400),
            new HouseholdItems("Toilet Paper", 5.00, 1000),

        }
        ArrayList<GroceryItem> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        

    }

}
