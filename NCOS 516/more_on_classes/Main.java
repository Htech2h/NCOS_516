package more_on_classes;

public class Main {
    public static void main(String[] args) {
       GandS gands = new GandS();
       gands.Setprice(1000);
       gands.SetServiceDescription("Maize");
       System.out.println(gands.Getprice());
       System.out.println(gands.GetServiceDescription() + " Is damn expensive");


    }
}
