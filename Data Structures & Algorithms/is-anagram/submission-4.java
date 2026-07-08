class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] mas = new int[26];

        for(char c : s.toCharArray()) {
            mas[c - 'a']++;
        }

        for(char c : t.toCharArray()) {
            if(mas[c - 'a'] == 0) {
                return false;
            }
            mas[c - 'a']--;
        }

        return true;
    }

}
