package more_on_classes;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.203.170.53", 3000);

        PrintWriter pr = new PrintWriter(socket.getOutputStream(), true);
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter some stuff: ");
            String userInput = sc.nextLine();

            if (userInput.equals("-1")) {
                break;
            }

            pr.println(userInput);
            pr.flush();

            String response = br.readLine();
            System.out.println("Server: " + response);
        }

        pr.close();
        br.close();
        socket.close();
    }
}
//This was not as fun as I thought it would be :|
