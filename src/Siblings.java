import java.util.ArrayList;
import java.util.Collections;

public class Siblings {
    public static void main(String[] args) {

        long x = 1_105_555_504;
        System.out.print(sollution(x));
    }

    public static long sollution(long x) {
        ArrayList<Long> result = new ArrayList<>();
        while(x >= 10) {
            result.add(x % 10);
            x /= 10;
        }
        result.add(x);
        Collections.sort(result);
        x = 0;
        for(int i = 0; i < result.size(); i++) {
            x += result.get(i)*Math.pow(10,i);
        }
        return x;
    }
}

//Find max sibling of a specified number