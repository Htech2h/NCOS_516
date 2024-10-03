package methods.Hello;

import java.util.Scanner;



public class overload {

    public static int math(int a, int b, int c) {

        return a + b + c;
    }
    public static double math(int a, int b) {
        return a+b;
    }
    public static int math(int a, int b,int c, int d) {
        return a*b*c*d;
    }
    public static double math(double a, double b, double c) {
        return a+b+c;
    }
    public static int math()
    {
        return math(1,2,3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The sum is " + math(a, b, c));
        System.out.println("multiplication of two number " + math(a, b, c,a));
        System.out.println("doubles "+math(3.14,5.44,3.1415));
        System.out.println("two numbers" +math(a,b));
        System.out.println("empty " + math());

    }
}
