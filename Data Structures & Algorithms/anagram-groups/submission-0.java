

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String word = strs[i];

            // step 1: sort the word
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // step 2: if key not present → create list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // step 3: add word in list
            map.get(key).add(word);
        }

        // step 4: return all groups
        return new ArrayList<>(map.values());
    }
}