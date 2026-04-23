class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int maxCount = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i ++) {
            int substrac = nums[i] - nums[i-1];
            if (substrac == 1){
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else if(substrac == 0) {
                continue;
            } else {
                count = 0;
            }
        }
        return maxCount +1;
    }
}
