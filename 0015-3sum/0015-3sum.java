class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++){
            
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i=k+1;
            int j=nums.length-1;

            while(i<j){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    while(i<j && nums[i]==nums[i+1]) i++;
                    while(i<j && nums[j]==nums[j-1]) j--;
                    i++;
                    j--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return res;
    }
}