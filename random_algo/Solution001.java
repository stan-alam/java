import java.util.ArrayList;

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
    System.out.println(nums.length);
    int newNum = solution.removeDuplicates(nums);
    System.out.println(newNum);
    
  }
}
