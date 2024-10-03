package UCT;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println( NumberUtils.countMatches(123,123));
        System.out.println(Arrays.toString(NumberUtils.toArray(234)));
        System.out.println(NumberUtils.countIntersect(321,123));
    }
}
