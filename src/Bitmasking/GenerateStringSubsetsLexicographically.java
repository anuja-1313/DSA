package Bitmasking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
No.of subsets = 2^n
Time Complexity: O(n * 2^n)
Space Complexity: O(n * 2^n)
 */
public class GenerateStringSubsetsLexicographically {

    public static void main(String[] args) {
        String str = "cdab";
        char[] ch = str.toCharArray();
        Arrays.sort(ch); //abcd
        int n = ch.length; //4

        //total subsets of the given string
        int total = 1 << n; //16

        List<String> result = new ArrayList<>();
        //starting i from 1 to skip null subset
        for(int i=1; i<total; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                //using binary numbers to generate subsets
                if((i & (1 << j)) != 0) {
                    sb.append(ch[j]);
                }
            }
            result.add(sb.toString());
        }

        Collections.sort(result);
        for(String s : result){
            System.out.println(s);
        }
    }
}
