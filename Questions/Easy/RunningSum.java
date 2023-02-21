// 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i ==  0){
                arr[i] = nums[i];
            } else {
                arr[i] = arr[i - 1] + nums[i];
            }

        }
        return arr;
    }
}
