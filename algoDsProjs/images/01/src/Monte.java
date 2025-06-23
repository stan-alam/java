// estimate the winning probability of a player using the Monte Carlo method

public class Monte {
    public static void main(String[] args){

        // number of trials 
        final int TRIALS = 1000000;
        //count the number of trials that result in a win
        int numWins = 0; // start with no wins
        // now iterate through the trials
        for (int i = 0; i < TRIALS; i++) {

            //sim three dice
            int die1 = (int)(Math.random() * 6) + 1;
            int die2 = (int)(Math.random() * 6) + 1;
            int die3 = (int)(Math.random() * 6) + 1;
        } 
        // you will lose the bet on a triple
        if (die1 == die2 && die2 == die3) {
            continue; // go to next iteration of the loop
        }
        // here the bet wins on a sum greater than 10
        else if (die1 + die2 + die3) > 10 {
            numWins++;
        }   
    //not complete
    }
}