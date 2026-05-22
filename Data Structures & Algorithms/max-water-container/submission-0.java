class Solution {
    public int maxArea(int[] heights) {


        int left = 0;
        int right = heights.length - 1;
        int MaxWater = 0;

        while(left < right){
            int water = ( right - left)* Math.min(heights[left], heights[right]);
            MaxWater= Math.max(MaxWater , water);

            if(heights[left]< heights[right]){
                left ++;
            }

            else{
                right--;
            }
            
        }

        return MaxWater;

        
    }
}
