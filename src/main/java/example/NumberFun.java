package example;

public class NumberFun {
    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) % 1 != 0) {
            return -1;
        }
        long result = sq +1;
        while (Math.sqrt(result)%1!= 0){
            result++;
        }
        return result;
    }
}