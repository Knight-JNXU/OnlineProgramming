package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Knigh on 2016/10/11.
 * http://www.nowcoder.com/practice/f094aed769d84cf3b799033c82fc1bf6?tpId=49&tqId=29301&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class StringFormat {

//    @Test
//    public void test(){
//        System.out.println((int)'0');
//        System.out.println((int)'9');
//        System.out.println((int)'A');
//        System.out.println((int)'Z');
//        System.out.println((int)'a');
//        System.out.println((int)'z');
//    }

    @Test
    public void test(){
        char chars[] = {'Z'};
        System.out.println(formatString("GAY",3, chars,1));
    }
    

    public String formatString(String A, int n, char[] arg, int m) {
        List<Character> paramList = new ArrayList<>();
        char paramChars[] = arg;
        for(int i=0; i<paramChars.length; i++){
            if(paramChars[i]>='A' && paramChars[i]<='z'){
                paramList.add(paramChars[i]);
            }
        }
        char originChars[] = A.toCharArray();
        String result = "";
        int paramListIndex = 0;
        for(int i=0; i<originChars.length; i++){
            if(originChars[i]>='A' && originChars[i]<='z'){
                result += originChars[i];
            }else{
                if(originChars[i]=='%'){
                    result+=paramList.get(paramListIndex);
                    paramListIndex++;
                    i++;
                }
            }
        }
        for(int i=paramListIndex; i<paramList.size(); i++){
            result += paramList.get(i);
        }
        return result;
    }
}
