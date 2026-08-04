class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftProduct[] = new int[n]; 
        int rightProduct[] = new int[n];
        leftProduct[0] = 1;
        rightProduct[n-1] = 1;
        int res[] = new int[n];
        int currentProduct = 1;
        for(int i=1;i<n;i++){
            currentProduct *= nums[i-1]; 
            leftProduct[i] = currentProduct;
        }
        currentProduct = 1;
        for(int i=n-2;i>=0;i--){
            currentProduct *= nums[i+1]; 
            rightProduct[i] = currentProduct;
        }

        for(int i=0;i<n;i++){
            res[i] = leftProduct[i]*rightProduct[i];
        }
        return res;
    }
}