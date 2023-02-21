// 1929. Concatenation of Array

package Questions.Easy;

class GetConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }
        int j = 0;
        for(int i = nums.length; i < arr.length; i++){
            arr[i] = nums[j++];
        }
        return arr;
    }
}
