package 백준.S20230212;

import java.util.Arrays;
import java.util.HashSet;

public class 둘만의_암호 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        int count = 0 ;
        char[] sArr = new char[s.length()];
        char[] sArrLength = new char[s.length()];
        char[] skipArr = new char[skip.length()];


        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = s.charAt(i);
            // if 만약에 skip 에 단어가 있으면 index + 중복값 을 해준다.
            // 그렇지않으면 그냥 index만 더한다.

            char ch = (char) ((char) (int)sArr[i]+index);
            for (int j = 0; j < index; j++) {
                sArrLength[i] = (char) ((char) (int) sArr[i] + (j+1));
            }
            HashSet<Character> hashSet =  new HashSet(Arrays.asList(sArrLength));

            for (int j = 0; j < skipArr.length; j++) {
                count = 0;
                skipArr[j] = skip.charAt(j);

                for (int o = 0; o < sArrLength.length; o++) {
                    if (sArrLength[o] == skipArr[j]) {
                        count++;
                        System.out.println((char) ((char) (int)sArr[i]+index+ count));
                    }else{
                        System.out.println((char) ((char) (int)sArr[i]+index));
                    }
                }
            }

        }

    }

    class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";
            return answer;
        }
    }
}
