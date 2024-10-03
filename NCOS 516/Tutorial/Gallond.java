package Tutorial;

import java.util.Scanner;

public class Gallond {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int quarts_in_a_Gallon = sc.nextInt();
        int quarts_Needed = sc.nextInt();
        System.out.println("A job that needs " + quarts_Needed +
                " quarts will require " + quarts_Needed/quarts_in_a_Gallon + " Gallons plus "
        +quarts_Needed%quarts_in_a_Gallon + " quarts");
    }
}
