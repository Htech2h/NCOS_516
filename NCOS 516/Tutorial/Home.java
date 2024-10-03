package Tutorial;

import java.util.Scanner;

public class Home {
    static double costEstimate(double MC, double WH, double TH){
        return MC + (WH*35) + (TH*12);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter JOBNAME, MATERIAL COST, WORK HOUR, TRANSPORT HR: ");
        String jobName = sc.nextLine();
        double materialCost = sc.nextDouble();
        double workHour = sc.nextDouble();
        double travelHour = sc.nextDouble();
        double hrCost = costEstimate(materialCost, workHour, travelHour);
        System.out.println("Job Name: "+ jobName +"\n"+ "Cost: R" + costEstimate(materialCost, workHour, travelHour));

    }
}
