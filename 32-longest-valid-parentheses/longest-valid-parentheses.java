class Solution {
    public int longestValidParentheses(String a) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int max =0;
        for(int i =0 ; i< a.length(); i++){
            if(a.charAt(i) == '('){
                s.push(i);
            }
            else if(a.charAt(i)==')'){
                s.pop();
                if(s.isEmpty()){
                    s.push(i);
                }
                int length = i -s.peek();
                max = Math.max(length ,max);
            }
        }
    return max;
    }
}