class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;

        for(Character ch : s.toCharArray()) {
           if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                } else if (ch == ']' && top != '[') {
                    return false;
                } else if (ch == '}' && top != '{') {
                    return false;
                }         
            }

        }

        return stack.isEmpty();
    }
}
