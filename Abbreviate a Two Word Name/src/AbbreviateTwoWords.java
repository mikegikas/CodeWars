public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String newName = "";
        String[] parts = name.split(" ");
        newName += parts[0].substring(0,1).toUpperCase() + "." + parts[1].substring(0,1).toUpperCase();
        return newName;
    }
}


//    Write a function to convert a name into initials.
//    This kata strictly takes two words with one space in between them.
//
//    The output should be two capital letters with a dot seperating them.
//
//    It should look like this:
//
//    Sam Harris => S.H
//
//    Patrick Feeney => P.F
