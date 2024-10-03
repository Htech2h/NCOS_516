package classtest2;

import javax.swing.*;

public class listFact {
    static void factDisplay(int n)
    {
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
            System.out.print(i);
            if(i < n){
                System.out.print(" * ");
            }
        }
        System.out.println(" = "+factorial);
    }

    static void factDisplay2()
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter input"));
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
            System.out.print(i);
        }
    }
    public static void main(String[] args){
        factDisplay(10);
    }
}
