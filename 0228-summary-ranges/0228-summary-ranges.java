class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length==0) return res;
        int n=nums.length;
        int i=0;
        for(;i<n-1;i++){
            int start = nums[i];
            while(i<n-1 && nums[i]==nums[i+1]-1){
                i++;
            }
            int end = nums[i];
            if(start == end) res.add(String.valueOf(start));
            else res.add(start+"->"+end);
        }
        if(i==n-1) res.add(String.valueOf(nums[i]));
        return res;
    }
}