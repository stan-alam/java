public class Prog1 
{

    int function1(int n) {
        int m = 0;
        for (int i = 0; i < n; i++) {
            m += 1;
        }
        return m;
        // time complexity: O(n) single loop for loop takes linear time
    }



public static void main(String[] args) {
    Prog1 prog1 = new Prog1();
    int result = prog1.function1(42);
    System.out.println("Here's the result: " + result);
    } 
}
