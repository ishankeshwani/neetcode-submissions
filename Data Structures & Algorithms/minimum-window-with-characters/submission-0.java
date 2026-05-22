class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] count = new int[128];

        // Store frequency of t
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int right = 0;

        int required = t.length();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char r = s.charAt(right);

            // Reduce count
            if (count[r] > 0) {
                required--;
            }

            count[r]--;

            right++;

            // Valid window found
            while (required == 0) {

                // Update minimum window
                if (right - left < minLength) {

                    minLength = right - left;
                    start = left;
                }

                char l = s.charAt(left);

                count[l]++;

                // Window becomes invalid
                if (count[l] > 0) {
                    required++;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}