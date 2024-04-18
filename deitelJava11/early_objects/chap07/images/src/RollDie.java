import java.security.SecureRandom;
// 319..A program that simulates the rolling of a die 70,000,000 times and displays the frequency of each face.
public class RollDie {
    public static void main(String[] args)
    {
        SecureRandom randomNumbs = new SecureRandom();
        int[] frequency = new int[7]; // array of freq counters

        //roll die 70,000,000 times
        for (int roll = 1; roll <= 70_000_000; roll++)
        {
            ++frequency[1 + randomNumbs.nextInt(6)];
        }
    

        System.out.printf("%s%10s\n", "Face", "Frequency");

        //output each array element's value
        for (int face = 1; face < frequency.length; face++)
        {
            System.out.printf("%4d%10d\n", face, frequency[face]);
        }

    }
}