import java.util.Scanner;

public class LoopMe {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Expresso (y/n)?");
        boolean checkInput = true;

        String response = in.next();

        //now loop until user inputs a valid response
        while (checkInput) {
            //if response is y or n, exit loop
            if (response.equalsIgnoreCase("y") ||  response.equalsIgnoreCase("n"))
            {
                checkInput = false;
            } else {
                System.out.println("Enter y or n");
                response = in.next();
            }
        }
        System.out.println("Thanks!");
    
        in.close();
    }
}