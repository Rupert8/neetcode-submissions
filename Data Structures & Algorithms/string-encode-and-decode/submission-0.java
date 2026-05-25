class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();

        for(String str : strs) {
            encodeString.append(str.length() + "#" + str);
        }

        System.out.println(encodeString.toString());
        return encodeString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while(i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            
            i = j + 1;
            
            String s = (str.substring(i,i + len));
            result.add(s);

            i = i + len;
        }

        return result;
    }
}
