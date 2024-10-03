package classtest2;

import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter room number");
        System.out.println("Enter 1 for queen bed|| 2 for king bed|| 3 for a king and a pullout couch");
        a = sc.nextInt();


        switch(a) {
            case 1:
                System.out.print("$125 for queen bed");
                break;
            case 2:
                System.out.print("$139 for king bed");
                break;
            case 3:
                System.out.print(" $165 for a suite with a king bed and a pullout couch");
                break;
            default:
                System.out.print("Enter Correct digits bitch");
                break;
        }
    }
}