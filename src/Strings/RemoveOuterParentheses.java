package Strings;

public class RemoveOuterParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    result.append(c);
                }
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveOuterParentheses solution = new RemoveOuterParentheses();

        System.out.println(solution.removeOuterParentheses("(()())(())")); // Output: "()()()"
        System.out.println(solution.removeOuterParentheses("(()())(())(()(()))")); // Output: "()()()()(())"
        System.out.println(solution.removeOuterParentheses("()()")); // Output: ""
    }
}
