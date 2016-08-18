/*
 * Given a string array words, find the maximum value of 
 * length(word[i]) * length(word[j]) where the two words do 
 * not share common letters. You may assume that each word 
 * will contain only lower case letters. If no such two 
 * words exist, return 0.

 * Example 1:
 * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
 * Return 16
 * The two words can be "abcw", "xtfn".
 * 
 * Example 2:
 * Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 * Return 4
 * The two words can be "ab", "cd".
 * 
 * Example 3:
 * Given ["a", "aa", "aaa", "aaaa"]
 * Return 0
 * No such pair of words.
 */
public class MaximumProductOfWordLengths {

    public int maxProduct(String[] words) {
        int result = 0;


        return result;
    }

    public boolean hasNoCommonLetters(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return true;
        }
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); ++i) {
            if (count[s1.charAt(i) - 'a'] == 0) {
                count[s1.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < s2.length(); ++i) {
            if (count[s2.charAt(i) - 'a'] > 0) {
                return false;
            }
        }
        return true;
    }

}
