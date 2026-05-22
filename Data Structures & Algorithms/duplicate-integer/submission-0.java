class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> isin = new HashSet<>();
        for(int num : nums){
            if(isin.contains(num))
            {
                return true;
            }
            isin.add(num);
        }
        return false;
    }
}