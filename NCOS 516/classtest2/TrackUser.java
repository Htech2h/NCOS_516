package classtest2;

import java.util.Scanner;

public class TrackUser {

    static void ascending(int a,int b, int c)
    {
        int[] arr = {a,b,c};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
            System.out.print(arr[i]);
        }
    }

    static void descending(int a,int b, int c)
    {
        int[] arr = {a,b,c};
        for(int i=0;i<arr.length;i++){
            int max = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max]< arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[max];
            arr[max]= temp;
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter b");
        b = sc.nextInt();
        System.out.println("Enter c");
        c = sc.nextInt();

        ascending(a,b,c);
        System.out.println();
        descending(a,b,c);
    }
}
