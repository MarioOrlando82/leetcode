class Solution {
    public boolean isPalindrome(int x) {
        String text = Integer.toString(x);
        for(int i = 0; i < text.length() / 2; i++){
            if(text.charAt(i) != text.charAt(text.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}