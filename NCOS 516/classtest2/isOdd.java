package classtest2;

import java.util.Scanner;

public class isOdd {

    static boolean isOdd(int num) {
        if(num %2 ==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isOdd(a)){
            System.out.println("THe Number is Even");
        }else{
            System.out.println("THe Number is Odd");
        }
    }
}
