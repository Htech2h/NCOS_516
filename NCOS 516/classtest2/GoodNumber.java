package classtest2;

import java.util.Scanner;

public class GoodNumber {
    static void goodnum()
    {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter an Even number[999 will end loop]");
            int a = sc.nextInt();
            if(a==999){
                System.out.println("Code Terminated");
                break;
            }
            if(a%2==0){
                System.out.println("good job");
            }else{
                System.out.println("Error");
            }
        }
    }
    public static void main(String[] args) {
        goodnum();
    }
}
