public class Solution {
    public static boolean check(Object[] a, Object x) {
        for (Object obj: a){
            if (obj.equals(x)){
                return true;
            }
        }
        return false;
    }
}


//    You will be given an array a and a value x. All you need to do is check
//    whether the provided array contains the value.
//    Array can contain numbers or strings. X can be either.
//    Return true if the array contains the value, false if not.