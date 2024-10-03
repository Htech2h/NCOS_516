package Tutorial;

import java.util.Scanner;

public class FormLetterWriter {

    static void displaySalutation(String name){
        System.out.println("Dear "+name);
        System.out.println("Thank you for your recent order");
    }

    static void displaySalutation(String name, String lastName){
        System.out.println("Dear "+name+" "+lastName);
        System.out.println("Thank you for your recent order");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter lastName: ");
        String lastName = sc.nextLine();
        displaySalutation(name);
        displaySalutation(lastName, name);
    }
}
