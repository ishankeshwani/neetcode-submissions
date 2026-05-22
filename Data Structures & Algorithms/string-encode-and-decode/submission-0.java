class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();
        for(String str: strs){
            res.append(str.length()).append("#").append(str);
        }

        return res.toString();

    }

    public List<String> decode(String s) {

        List<String>result = new ArrayList<>();

        int i = 0;
        while(i< s.length()){
            int j = i;

            while(s.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(s.substring(i , j));
            j++;

            String word = s.substring(j , j+length);
            result.add(word);

             i = j+ length;

                }
    return result;

    }
}