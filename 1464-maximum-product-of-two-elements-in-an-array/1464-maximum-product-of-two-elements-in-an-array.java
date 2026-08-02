class Solution {
    public int maxProduct(int[] nums) {
        int i=0;
        int j=nums.length - 1;
        int maxProduct = 0;
        while(i<j){
            maxProduct = Math.max(maxProduct,(nums[i]-1)*(nums[j]-1));
            if(nums[i]<nums[j]) i++;
            else j--;
        }
        return maxProduct;
    }
}