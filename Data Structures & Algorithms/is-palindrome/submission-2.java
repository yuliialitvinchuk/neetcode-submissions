class Solution {
    public boolean isPalindrome(String s) {
        String sNoSpaces = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = sNoSpaces.length()-1; i >= 0; i--) {
            reversed += sNoSpaces.charAt(i);
        }
        return reversed.equals(sNoSpaces);
    }
}
