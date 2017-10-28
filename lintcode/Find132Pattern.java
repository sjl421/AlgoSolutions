/*
Given a sequence of n integers a1, a2, ..., an, a 132 pattern is a subsequence
ai, aj, ak such that i < j < k and ai < ak < aj. Design an algorithm that takes
a list of n numbers as input and checks whether there is a 132 pattern in the
list.

n will be less than 20,000.

Example
Given nums = [1, 2, 3, 4]
return False // There is no 132 pattern in the sequence.

Given nums = [3, 1, 4, 2]
return True // There is a 132 pattern in the sequence: [1, 4, 2].
 */
public class Find132Pattern {

    /*
     * @param nums: a list of n integers
     * @return: true if there is a 132 pattern or false
     */
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int i = 0;
        while (i < nums.length) {
            while (i < nums.length - 1 && nums[i] > nums[i + 1]) {
                ++i;
            }
            int j = i + 1;
            while (j < nums.length - 1 && nums[j] < nums[j + 1]) {
                ++j;
            }
            int k = j + 1;
            while (k < nums.length) {
                if (nums[i] < nums[k] && nums[k] < nums[j]) {
                    return true;
                }
                k++;
            }
            i = j + 1;
        }
        return false;
    }

}
