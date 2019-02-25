package com.mike;

public class TotalPoints {

    public static int points(String[] games) {
        int total = 0;
        for (String game : games){
            String[] parts = game.split(":");
            int x =Integer.parseInt(parts[0]);
            int y =Integer.parseInt(parts[1]);

            if (x > y){
                total += 3;
            }else if (x == y){
                total += 1;
            }
        }
        return total;
    }
}


//    Our football team finished the championship. The result of each match look like "x:y".
//    Results of all matches are recorded in the array.
//
//    For example: ["3:1", "2:2", "0:1", ...]
//
//    Write a function that takes such list and counts the points of our team in the championship.
//    Rules for counting points for each match:
//
//    if x>y - 3 points
//    if x<y - 0 point
//    if x=y - 1 point

//    Notes:
//
//    there are 10 matches in the championship
//    0 <= x <= 4
//    0 <= y <= 4