import java.util.Arrays;

public class Kata {

    public static int[] splitAndAdd(int[] numbers, int n) {
        int[] initArray = Arrays.copyOf(numbers, numbers.length);
        while (initArray.length > 1 && n-- > 0) {
            int[] secondArray = Arrays.copyOfRange(initArray, initArray.length / 2, initArray.length);
            for (int i = 0 ; i < initArray.length / 2 ; i++){
                secondArray[i + initArray.length % 2] += initArray[i];
            }
            initArray = secondArray;
        }
        return initArray;
    }
}
