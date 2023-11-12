import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        if (itemPrice >= 100)
        {
            System.out.println("Shipping Cost: 0");
        } else
        {
            double shippingCost = 0.02 * itemPrice;
            System.out.println("Shipping Cost: " + shippingCost);
        }

        double totalPrice = itemPrice;
        System.out.println("Total Price: $" + totalPrice);
    }
}