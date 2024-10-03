package classtest2;


import java.util.Scanner;

public class TrackUser2 {

    static void ascending2(int a, int b , int c)
    {
       int []arr = {a,b,c};
       for(int i=0;i<3;i++){
           int min=i;
           for(int j=i+1; j<3;j++){
               if(arr[min] > arr[j]){
                   min=j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
           System.out.print(arr[i]+" ");
       }
    }

    static void descending2(int a, int b , int c){
        int []arr= {a,b,c};
        for(int i =0; i<3 ; i++){
            int max = i;
            for(int j=i+1; j<3;j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b = sc.nextInt();
        c= sc.nextInt();
        descending2(a,b,c);

    }
}
