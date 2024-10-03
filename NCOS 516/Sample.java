import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum;
        int product;
        sum = x+y;
        product = x*y;

        System.out.println(product);
        System.out.println(sum);
    }
}
