package solo;

public class PrimeSeq {
    public static void main(String[] args) {

        int i = 2, k = 0;
        while (k < 50) {
            boolean isPrime = false;
            for (int j = 2; j <= ((int)i/2); j++) {
                if (i % j == 0) {
                    isPrime = true;
                }
            }
            if (!isPrime) {
                System.out.print(i + " ");
                k++;
            }
            if (k % 10 == 0) {
                System.out.println("");
            }
            i++;

        }
    }
}