package code0;

import java.util.Scanner;

/**
 * Created by Knigh on 2016/10/11.
 * http://www.nowcoder.com/practice/655a43d702cd466093022383c24a38bf?tpId=49&tqId=29295&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class PalindromeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String inputStr = sc.nextLine();
            char chars[] = inputStr.toCharArray();
            int charLen = chars.length;
            int i, j; boolean flag = true; int diff = 0;
            for(i=0, j=charLen-1; i<=j; i++, j--){
                if(chars[i] != chars[j]){
                    diff++;
                    if(diff > 1){
                        flag = false;
                        break;
                    }
                    if(chars[i+1]==chars[j]){
                        j++;
                    }else{
                        i--;
                    }
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
