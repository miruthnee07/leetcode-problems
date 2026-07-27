class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];

        // Count frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        // Prefix sum
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        int[] ans = new int[nums.length];

        // Find count of smaller numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = count[nums[i] - 1];
            }
        }

        return ans;
    }
}
