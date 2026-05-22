

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int j = map.get(complement);

                if (j < i) {
                    return new int[]{j, i};
                } else {
                    return new int[]{i, j};
                }
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // required fallback
    }
}