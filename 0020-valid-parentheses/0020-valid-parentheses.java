class Solution {
    public boolean checkPair(char oBrack,char cBrack){
        if(oBrack=='(' && cBrack==')'){
            return true;
        }else if(oBrack=='[' && cBrack==']'){
            return true;
        }else if(oBrack=='{' && cBrack=='}'){
            return true;
        }else{
            return false;
        }
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                else{
                    if(checkPair(stack.peek(),ch)){
                        stack.pop();
                    }else{
                        return false;
                    }
                } 
            }
        }
        if(stack.isEmpty()) return true;
        else return false;

    }
}