package org.algorithm.simple;

/**
 * 2810.故障键盘
 * @author jiahe
 */
public class MalfunctioningKeyboard {

    public String finalString(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'i') {
                res.reverse();
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

}
