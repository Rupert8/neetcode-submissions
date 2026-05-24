class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        if(firstString.length != secondString.length) return false;

        for(int i = 0; i < firstString.length; i++) {
            if(firstString[i] != secondString[i]) return false;
        }

        return true;
    }
}
