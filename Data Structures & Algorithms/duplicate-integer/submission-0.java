class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (numsMap.containsKey(nums[i])) {
                return true;
            }
            numsMap.put(nums[i], i);
        }
        return false;
    }
}