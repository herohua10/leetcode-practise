package com.herohua;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _3无重复字符的最长子串 {

    @Test
    public void test() {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        List<Character> results = new ArrayList<>();

        char[] allChars = s.toCharArray();
        for (int i = 0; i <allChars.length; i++) {
            int crashIndex = results.indexOf(allChars[i]);
            results.add(allChars[i]);
            if (crashIndex > -1) {
                // 发现重复字符，移动窗口
                results = results.subList(crashIndex + 1, results.size());
            }
            maxLength = Math.max(maxLength, results.size());
        }
        return maxLength;
    }
}
