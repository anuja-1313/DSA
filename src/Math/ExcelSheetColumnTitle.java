package Math;

public class ExcelSheetColumnTitle {
    /*
168. Excel Sheet Column Title
TC: O(N)
SC: O(1)
*/
    class Solution {
        public String convertToTitle(int n) {
            // write your code here
            StringBuilder sb = new StringBuilder();

            while(n > 0){ //n = 28 //n=1
                n--; //excel columns are 1 indexed //n=27 //n=0
                int rem = n % 26; //27%26 //0%26
                char ch = (char)(rem + 'A'); // 1 + A = B // 0+A = A
                sb.append(ch); //B //BA
                n = n / 26; //1
            }

            return sb.reverse().toString();
        }

    }
}
