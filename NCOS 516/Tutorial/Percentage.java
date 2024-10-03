package Tutorial;
import java.util.Scanner;
public class Percentage {
    static double percent(double per1, double perc2){
        return per1/perc2*100;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double per1 = sc.nextDouble();
        double perc2 = sc.nextDouble();
        System.out.println(percent(per1, perc2));
        System.out.println(percent(perc2, per1));
    }
}
