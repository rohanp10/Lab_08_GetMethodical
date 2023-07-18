import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double price = 0;
        double totalCost = 0;
        boolean moreItems = true;

        do {
            price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 9.99);
            totalCost += price;

            moreItems = SafeInput.getYNConfirm(in, "Do you have more items");
        } while(moreItems);

        System.out.printf("\nThe total cost of the items is $%.2f", totalCost);
    }
}
