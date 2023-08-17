class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charFreq = new int[26];
        int count = 0;
        
        // Calculate character frequencies in chars
        for (char c : chars.toCharArray()) {
            charFreq[c - 'a']++;
        }
        
        // Check if each word can be formed from chars
        for (String word : words) {
            if (canBeFormed(word, charFreq.clone())) {
                count += word.length();
            }
        }
        
        return count;
    }
    
    private boolean canBeFormed(String word, int[] charFreq) {
        for (char c : word.toCharArray()) {
            if (charFreq[c - 'a'] == 0) {
                return false;
            }
            charFreq[c - 'a']--;
        }
        return true;
    }
}
