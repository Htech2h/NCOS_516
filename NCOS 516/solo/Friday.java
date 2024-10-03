package solo;

import java.util.Scanner;

public class Friday {
    static Boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= ((int) n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i =0; i<100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
