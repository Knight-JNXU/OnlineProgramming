package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/17. Main
 * http://www.nowcoder.com/practice/f72adfe389b84da7a4986bde2a886ec3?tpId=49&tqId=29285&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class StringCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            String s1 = strs[0];
            String s2 = strs[1];
            int len1 = Integer.parseInt(strs[2]);
            int len2 = Integer.parseInt(strs[3]);
            long num1 = 0;
            long num2 = 0;
            int letterNum = 26;
            for(int i=0; i<s1.length(); i++){
                num1 = num1*letterNum + (s1.charAt(i)-'a');
            }
            for(int i=0; i<s2.length(); i++){
                num2 = num2*letterNum + (s2.charAt(i)-'a');
            }
            System.out.println((num2-num1-1));
        }
    }

}
