public class Kata {
    public static String countingSheep(int num) {
        String word = "";
        for (int i = 1; i <= num; i++){
            word += i + " sheep...";
        }
        return word;
    }
}



//    Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
//    Input will always be valid, i.e. no negative integers.
