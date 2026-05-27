class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[]check1 = s.toCharArray();
        char[]check2 = t.toCharArray();
        Arrays.sort(check1);
        Arrays.sort(check2);
        for (int i = 0; i < s.length() && i < t.length(); i++) {
            if (check1[i] != check2[i]) {
                return false;
            }
        }        
        return true;
    }
}
