//remove duplicates from sorted array, again!
//time complexity O(n), space complexity : O(1)
public class Solution003 {
    /**
     * @param numbers
     * @return
     */
    public int removeDuplicate(int[] numbers){
        int n = numbers.length;
        int index = 0;
        for ( int i = 0; i < n; ++i ) {
            if ( i > 0 && i < n - 1 && numbers[i] == numbers[i - 1] && numbers[i] == numbers[i + 1])
            continue;

            numbers[index++] = numbers[i];

        }
    return index;
    }

public static void main(String[] args){
    int[] numberArray = { 1, 2, 3, 3, 4, 2, 5, 5, 9, 3, 2};
    
    for ( int number : numberArray){
        System.out.println("these are the elements in the array " + number);
    }
    Solution003 solution = new Solution003();
    int newArray = solution.removeDuplicate(numberArray);
    System.out.println("length of new array " + newArray);
    
    for (int i = 0; i < newArray; i++ ){
        System.out.println("these are the new sorted array elements" + newArray[i]);
    }

    }
}