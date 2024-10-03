package solo;
//5000 rands loan that you take from bank and bank charges at a rate of 2% pm
// and you repay 1.5k per month, how many month will it take to repay
public class Practice {
    public static void main(String[] args) {
        /*double ratePm = 100.0; // 5000 * 2/100
        double repayPM = 1500.0 + ratePm;
        System.out.println("It will take "+ Math.ceil(5000/repayPM) + " Months");

        */
        double ratePM = 5000* (2/100);
        double repayPM = 1500;
        double totalD = 5000;
        int months = 0;
        while (totalD > 0) {
            months += 1;
            totalD += ratePM;
            totalD -= repayPM;
        }
        System.out.println("It will take "+months+ " Months");
    }
}
