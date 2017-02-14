
/* Teron Briggs
   Norman Wilson
   Demarc Johnson
   2/14/2017
   Lab8BattingAvg
   Taking a batter and getting the average
*/

import java.util.Scanner;

public class Lab8Bonus {

    public static void main(String[] args) {

        int[][] atBatsArray;
        //Get user imput -or number at bats
        Scanner scan = new Scanner(System.in);
        String infoEntered;
        do {

            System.out.println("Enter number of batters? ");
            int atBatters = scan.nextInt();
            // Ask user to enter number of bats.
            System.out.println("Enter number at bats? ");
            int atBats = scan.nextInt();


            atBatsArray = new int[atBatters] [atBats] ;

            int numBatter = 1;
            // Get user input for number of bases.
            for (int row = 0; row < atBatsArray.length; row++) {
                System.out.println("Number of batter: " + numBatter);

                for (int col = 0; col < atBatsArray[row].length; col++) {
                    // Ask the user for number of bases earned by the batter.
                    System.out.println("Enter number of bases earned? ");
                    atBatsArray[row][col] = scan.nextInt();

                }
                numBatter++;
            }

/*loop through the batters (rows)
//for (int row = 0; row < numBatters; row++) {
            for (int row = 0; row < batStats.length; row++) {
                //loop through the atbats (columns) for this batter
                //for (int col = 0; col < atBats; col++) {
                for (int col = 0; col < batStats[row].length; col++) {
                    //take input for this at-bat
                    put it into batStats[row] [col] */

            System.out.println("Would  you like to know about another batter? Type Yes or no");
            infoEntered = scan.next();
            //System.out.println(atBatsArray);
        } while (infoEntered.equalsIgnoreCase("yes")) ; //Asking if user would like to know about more batters.
    }

    /* This method caculates slugging percent
     */
   /* public static double calculateSlugPer(int[][] atBatsArray) {
        int total = 0;
        for (int i = 0; i < atBatsArray.length; i++) {
            total += atBatsArray[i];
        }

        double slugPercent = (double) total / atBatsArray.length;
        return slugPercent;
    } */

    /* This method caculates batting avg
     */
    /* public static double calculateBatAverage(int[][] atBatsArray) {
        int i = 0;
        int count = 0;
        for (i = 0; i < atBatsArray.length; i++) {
            if (atBatsArray[i] > 0) {
                count++;
            }
        }
        double atBatsAvg = (double) count / atBatsArray.length;

        return atBatsAvg;


    } */

}

