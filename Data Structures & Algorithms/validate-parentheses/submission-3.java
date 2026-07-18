class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Set<Character> openBrackets = Set.of('(', '{', '[');
        for (char c : s.toCharArray()) {
            if (openBrackets.contains(c)) {
                stack.offerLast(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                switch (c) {
                    case ')':
                        if (stack.removeLast() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.removeLast() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.removeLast() != '[') {
                            return false;
                        }
                        break;
                }
            }
        }

        return stack.isEmpty();
    }
}
