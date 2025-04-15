package Stack;

import java.util.Stack;

public class ReversingAString {
    //GFG - Reversing the equation
    class Solution
    {

        String reverseEqn(String S)
        {
            // your code here
            Stack<Character> st = new Stack<>();
            int n = S.length();
            int pointer = n - 1;
            // String rev = "";
            StringBuilder rev = new StringBuilder();

            while(pointer >= 0){
                if(S.charAt(pointer) == '+' || S.charAt(pointer) == '-'
                        || S.charAt(pointer) == '*' || S.charAt(pointer) == '/'){
                    while(st.size() != 0){
                        //empty stack and add number encountered to rev string
                        rev.append(st.pop());
                    }

                    rev.append(S.charAt(pointer));
                    pointer--;
                }
                else{
                    //push into stack if numbers are encountered to preserve order
                    st.push(S.charAt(pointer));
                    pointer--;
                }
            }

            //in case we have any remaining elemnets(numbers) in stack
            //like 2 in ex: 1 wont have any operator remaining to perform the pop
            while(st.size() != 0){
                rev.append(st.pop());
            }

            return rev.toString();
        }
    }
}

