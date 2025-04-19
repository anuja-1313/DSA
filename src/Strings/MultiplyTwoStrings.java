package Strings;

public class MultiplyTwoStrings {

    /*
    Multiply two strings - GFG (Medium)
    43. Multiply Strings - (Medium)

    TC: O(N*M) , N and M being string lengths
    SC: O(N+M) , result array
     */
    class Solution
    {
        public String multiplyStrings(String s1,String s2)
        {
            //code here.
            //Need to revisit this question

            //1. Handle leading zeros
            s1 = leadingZeroes(s1);
            s2 = leadingZeroes(s2);

            //2. if any of the strings is '0' return 0
            if(s1.equals("0") || s2.equals("0")){
                return "0";
            }

            //3. Accounting for negative numbers
            boolean isNegative = false;
            if(s1.charAt(0) == '-'){
                isNegative = !isNegative;
                s1 = s1.substring(1);
            }

            if(s2.charAt(0) == '-'){
                isNegative = !isNegative;
                s2 = s2.substring(1);
            }

            //4. creating a result array
            int len1 = s1.length();
            int len2 = s2.length();
            int[] result = new int[len1 + len2];

            //5. cpnverting multiplication steps to code
            for(int i = len1 - 1; i>=0; i--){
                //converting corresponding character to integer
                //using ASCII values
                int digit1 = s1.charAt(i) - '0';
                for(int j = len2 - 1; j>=0; j--){
                    int digit2 = s2.charAt(j) - '0';
                    int mul = digit1 * digit2;
                    int sum = mul + result[i+j+1]; //adding to existing value

                    result[i+j+1] = sum % 10; //storing units place for multiplication result
                    result[i+j] += sum /10; //carry forward, adding carry to next number
                }
            }

            //6. converting to string
            //taking care of leading 0's
            int index = 0;
            while(result.length > index && result[index] == 0){
                index++;
            }

            StringBuilder sb = new StringBuilder();

            while(result.length > index){
                sb.append(result[index++]);
            }

            //taking care of negative numbers
            if(isNegative){
                sb.insert(0, '-');
            }


            return sb.toString();
        }

        public String leadingZeroes(String str){
            int i = 0;
            while((str.length()-1) > i && str.charAt(i) == '0'){
                i++; //moving forward when encounter extra zero
            }

            return str.substring(i);
        }
    }

}
