public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String word = "Odd";
        if (number % 2 == 0) word = "Even";
        return word;
    }
}


//    Create a function (or write a script in Shell) that takes an integer as an
//    argument and returns "Even" for even numbers or "Odd" for odd numbers.