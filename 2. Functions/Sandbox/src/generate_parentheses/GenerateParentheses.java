package generate_parentheses;

public class GenerateParentheses {
    static void generate(String line, int open, int close, int target) {
        if(open + close == target && open == close) {
            System.out.println(line);
        }
        if(open + close < target) {
            if(open > close) {
                generate(line + ")", open, close + 1, target);
            }
            if(open < target / 2) {
                generate(line + "(", open + 1, close, target);
            }
        }
    }

    public static void main(String[] args) {
        generate("", 0, 0, 10);
    }
}
