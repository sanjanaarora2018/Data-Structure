class Solution {
    public int[] getConcatenation(int[] nums) {
        //int[] nums={1,4,1,2};
        int[] ans=new int[2 * nums.length];
        int idx=0;
        for(int i=0;i<2;i++){
            for(int num : nums){
            ans[idx++]=num;
            }
        }
        return ans;
    }
}