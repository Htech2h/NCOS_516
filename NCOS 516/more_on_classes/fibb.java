package more_on_classes;

public class fibb {
    static void fibonacci(){
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i < 10; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args){
        fibonacci();
        System.out.println(fact(5));

    }
}
