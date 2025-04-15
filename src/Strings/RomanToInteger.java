package Strings;

public class RomanToInteger {
    /*
13. Roman to Integer - Easy
TC: O(N)
SC: O(1)
*/
    class Solution {
        public int romanToInt(String s) {
            int previous = getValue(s.charAt(0));
            int total = 0;
            for(int i=1; i<s.length(); i++){
                int current = getValue(s.charAt(i));
                if(previous < current){
                    total -= previous;
                }
                else {
                    total += previous;
                }

                previous = current;
            }

            total += previous; //adding last value;
            return total;
        }

        public int getValue(char ch){
            switch(ch){
                case 'I' : return 1;
                case 'V' : return 5;
                case 'X' : return 10;
                case 'L' : return 50;
                case 'C' : return 100;
                case 'D' : return 500;
                case 'M' : return 1000;
            }

            return 0;
        }
    }
}

