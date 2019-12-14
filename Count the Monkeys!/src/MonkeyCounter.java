import java.util.stream.IntStream;

public class MonkeyCounter
{
    public static int[] monkeyCount(final int n){
        int[] arr = IntStream.range(1, n + 1).toArray();
        return arr;
    }
}



//    You take your son to the forest to see the monkeys. You know that there are
//    a certain number there (n), but your son is too young to just appreciate the
//    full number, he has to start counting them from 1.
//
//    As a good parent, you will sit and count with him. Given the number (n),
//    populate an array with all numbers up to and including that number, but
//    excluding zero.
//
//    For example:
//
//    monkeyCount(10) // --> new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//    monkeyCount(1) // --> new int[]{1}