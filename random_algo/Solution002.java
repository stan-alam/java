//remove duplicate from a sorted array

class Solution002 {
    public int removeDuplicate(int[] number){
        if (number.length == 0)
        return 0;

        int index = 1;
        for (int i = 1; i < number.length; i++){
            if (number[i] != number[index-1])
                number[index++] = number[i];
        }
        return index;
    }
    public static void main(String[] args){
        Solution002 solution = new Solution002();
        int[] newNumbers = {1,2,3,3,4};
        int removedDuplicateNumbers = solution.removeDuplicate(newNumbers);
        System.out.println("number of sets in array" + removedDuplicateNumbers);

    }
}