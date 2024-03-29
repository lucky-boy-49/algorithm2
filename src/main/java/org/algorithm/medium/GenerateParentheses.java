package org.algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 22.括号生成
 * @author jiahe
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuffer s = new StringBuffer();
        s.append("(");
        dfs(n, 1, s, res, 1);
        return res;
    }

    private void dfs(int n, int i, StringBuffer s, List<String> res, int cut) {
        if (cut == n) {
            s.append(")".repeat(Math.max(0, i)));
            res.add(s.toString());
            return;
        }
        // 继续增加“（”
        dfs(n, i + 1, new StringBuffer(s).append("("), res, cut + 1);
        // 增加一个“）”
        if (i > 0) {
            StringBuffer stringBuffer = new StringBuffer(s.toString());
            stringBuffer.append(")");
            dfs(n, i - 1, stringBuffer, res, cut);
        }
    }

}
