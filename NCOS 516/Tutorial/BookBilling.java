package Tutorial;

import java.util.Scanner;

public class BookBilling {
    static double computeBill()
    {
        return 14.99 + (8/100.0 * 14.99);
    }
    static double computeBill(int quantityOrdered)
    {
        return (quantityOrdered*14.99) + (8/100.0*(quantityOrdered* 14.99));
    }
    static double computeBill(int quantityOrdered, double coupon)
    {
        double total = (quantityOrdered*14.99) - coupon;
        return total + (8/100.0*total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ordered products");
        int ordered = sc.nextInt();
        System.out.println("Enter the value of coupons");
        double coupon = sc.nextDouble();

        System.out.println("Total bill is R" + computeBill());
        System.out.println("The total bill is R" + computeBill(ordered));
        System.out.println("The total bill is R" + computeBill(ordered, coupon));
    }
}
