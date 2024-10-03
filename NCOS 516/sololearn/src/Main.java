import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String Lastname = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        int roomNum = Integer.parseInt(sc.nextLine());

        customer c = new customer();
        c.name = name;
        c.Lastname = Lastname;
        c.age = age;
        c.roomNum = roomNum;

        c.saveCustomerInfo();

        G_and_Setters gas = new G_and_Setters();
        gas.setColor("blue");
        System.out.println(gas.getColor());
    }
}