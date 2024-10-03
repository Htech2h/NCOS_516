package Tutorial;

import java.util.Scanner;

public class EggShit {
    public static void main(String[] args){
        double PriceDozen = 3.25;
        double individualEggs = 0.45;
        int dozen = 12;
        Scanner sc = new Scanner(System.in);
        int NumberOfEggs = sc.nextInt();
        double total = (NumberOfEggs/12)*PriceDozen + (NumberOfEggs%12)*individualEggs;
        System.out.println("you ordered "+ NumberOfEggs + "Eggs");
        System.out.println("thats "+NumberOfEggs/12 + " Dozen at 3.25 per dozen and ");
        System.out.println(NumberOfEggs%12 + " individual eggs at 0.45 per individual egg ");
        System.out.println("Total is "+ total);

    }
}
