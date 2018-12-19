package algorithm.leetcode;

import java.util.Stack;

public class Question97 {

    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    //s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
    //"aabcc"
    //"dbbca"
    //"aadbbcbcac"

    public static boolean isInterleave(String s1, String s2, String s3) {

        int idx1 = 0;
        int idx2 = 0;
        Stack<int[]> choices = new Stack<>();
        for (int i = 0; i < s3.length(); i++) {
            char s = s3.charAt(i);

            boolean s1Match = idx1 < s1.length() && s1.charAt(idx1) == s;
            boolean s2Match = idx2 < s2.length() && s2.charAt(idx2) == s;

            if (s1Match && s2Match) {
                int[] choice = {idx1, idx2 + 1, i};
                choices.push(choice);
            }
            if (s1Match) {
                idx1++;
            } else if (s2Match) {
                idx2++;
            } else {
                if (choices.empty()) {
                    return false;
                } else {
                    int[] choice = choices.pop();
                    idx1 = choice[0];
                    idx2 = choice[1];
                    i = choice[2];
                }
            }
        }
        return idx1 == s1.length() && idx2 == s2.length();
    }
}
