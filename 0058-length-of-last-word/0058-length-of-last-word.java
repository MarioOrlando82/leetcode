class Solution {
    public int lengthOfLastWord(String s) {
        String[] text = s.split(" ");
        int size = text.length;
        return text[size - 1].length();
    }
}