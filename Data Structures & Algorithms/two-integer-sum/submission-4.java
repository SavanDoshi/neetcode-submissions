class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0 ; i < n ; i++) {
            int rNum = target - nums[i];
            if (numsMap.containsKey(rNum)) {
                 return new int [] {numsMap.get(rNum), i};
            }
            numsMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
