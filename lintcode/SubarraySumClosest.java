/*
 * Given an integer array, find a subarray with sum closest to zero. Return the indexes of the first number and last number.

Example
Given [-3, 1, 1, -3, 5], return [0, 2], [1, 3], [1, 1], [2, 2] or [0, 4].

Challenge 
O(nlogn) time
 */
public class SubarraySumClosest {

    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public int[] subarraySumClosest(int[] nums) {
        int[] sum = new int[nums.length + 1];
        int[] index = new int[nums.length + 1];
        index[0] = -1;
        for (int i = 0; i < nums.length; ++i) {
            sum[i + 1] = sum[i] + nums[i];
            index[i + 1] = i;
        }
    }

    public void quicksort(int[] a, int aLow, int aHigh, int[] b, int bLow, int bHigh) {
        
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
