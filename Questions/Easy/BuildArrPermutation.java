// Build Array from Permutation
package Questions.Easy;

class BuildArrPermutation {
    public int[] buildArray(int[] nums) {
        int[] newarr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            newarr[i] = nums[nums[i]];
        }
        return newarr;
    }
}
