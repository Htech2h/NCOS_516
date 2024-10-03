package Tutorial;

import java.util.Scanner;

public class Donation {
    static String NameOfVolunteer(int DonationType)
    {
        if(DonationType == 1){
            return "Regina";
        }
        else if(DonationType == 2){
            return "MARCO";
        }else{
            return "Donation type not recognized";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Donation Type");
        System.out.println("[1]Clothing and [2]For other donations");
        int DonationType = sc.nextInt();
        System.out.println("Volunteer Name: "+NameOfVolunteer(DonationType));
    }
}
