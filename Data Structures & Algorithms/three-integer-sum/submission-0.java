

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element
        for (int i = 0; i < nums.length; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Two pointers
            while (left < right) {

                int sum =
                    nums[i] + nums[left] + nums[right];

                // Found valid triplet
                if (sum == 0) {

                    ans.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (
                        left < right &&
                        nums[left] == nums[left - 1]
                    ) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (
                        left < right &&
                        nums[right] == nums[right + 1]
                    ) {
                        right--;
                    }
                }

                // Need bigger sum
                else if (sum < 0) {
                    left++;
                }

                // Need smaller sum
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}