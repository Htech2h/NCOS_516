package UCT;

import java.util.Arrays;

public class NumberUtils {
    private NumberUtils() {}

    public  static int[] toArray(int n)
    {
        int length = Integer.parseInt(String.valueOf(n).length() + "");
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int countMatches(int n, int m)
    {
        int count = 0;
        String a = String.valueOf(n);
        String b = String.valueOf(m);
        int stop = a.length();
        while(stop > 0){
            if(a.charAt(stop-1)== b.charAt(stop-1)){
                count++;
            }
            stop--;
        }
        return count;
    }

    public static int countIntersect(int n, int m)
    {
        int count = 0;
        String a = String.valueOf(n);
        String b = String.valueOf(m);
        for(int i=0; i<a.length(); i++){
            for(int j=0; j<b.length(); j++){
                if(a.charAt(i)==b.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
