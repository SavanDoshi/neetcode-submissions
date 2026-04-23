class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int multi = 1;
        boolean zeroPresent = false;
        for (int num: nums) {
            if (num == 0 && zeroPresent == false){
                zeroPresent = true;
                continue;
            }
            multi = multi * num;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = multi;
                continue;
            }
            if (zeroPresent == true && nums[i]!= 0){
                result[i] = 0;
                continue;
            }
            result[i] = multi / nums[i];
        }
        return result;
    }
}  
