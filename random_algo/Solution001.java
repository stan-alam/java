public class Solution001 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        
        int index = 2;
        for (int i=2; i < nums.length; i++){
            if (nums[i] != nums[index - 2]){
                nums[index++] = nums[i];
            }
        }

        return index;
    }
public static void main(String[] args){
    Solution001 solution = new Solution001();
    int[] nums = {1, 1, 1, 2, 2, 3};
    int newNum = solution.removeDuplicates(nums);
    System.out.println("This is the count of numbers in the set " + newNum);

    for(int i = 0; i < newNum; i++){
        System.out.println("these are the new numbers without duplicat4es " + nums[i]);
    }

  }
}
