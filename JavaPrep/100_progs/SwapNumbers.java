//07
import java.util.Scanner;

class SwapNumbers
{
    public static void main(String args[]){
        int x, y;
        System.out.println("enter the value of X and Y");
        Scanner in = new Scanner(System.in);
        
        x = in.nextInt();
        y = in.nextInt();

        System.out.println("this is before swapping x = " + x + " y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("this is after swapping x = " + x + " y = " + y);
    }
}