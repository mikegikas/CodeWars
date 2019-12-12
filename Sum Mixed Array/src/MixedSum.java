import java.util.List;

public class MixedSum {

    public int sum(List<?> mixed) {
        int count = 0;
        for (Object element : mixed) {
            count += Integer.parseInt(element.toString());
        }
        return count;
    }
}

//    Given an array of integers as strings and numbers, return the
//    sum of the array values as if all were numbers.
//
//    Return your answer as a number.
