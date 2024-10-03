package more_on_classes;

import java.util.Scanner;

public class NumberDemo {
    public static int Display2Number(int n)
    {
        return 2*n;
    }
    public static int DisplayNumPlus5(int n)
    {
        return 5+n;
    }
    public static int DisplayNumSq(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Display twice num: "+Display2Number(n));
        System.out.println("number plus 5: "+DisplayNumPlus5(n));
        System.out.println("Number squared: "+DisplayNumSq(n));
        System.out.println("Display twice num: "+Display2Number(m));
        System.out.println("number plus 5: "+DisplayNumPlus5(m));
        System.out.println("Number squared: "+DisplayNumSq(m));
    }
}
