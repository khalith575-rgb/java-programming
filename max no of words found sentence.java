class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {
            int count = 1; // At least one word exists

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}