import java.util.Scanner;
public class methods {
    static String welcome(String str)
    {
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(welcome(str));
        System.out.println(Math.pow(2,2));
    }
}
