package code0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * http://www.nowcoder.com/practice/87608e500bb24e1782278154a1e43983?tpId=49&tqId=29356&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class FindChildStrIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = br.readLine();
        while (!s.equals("EOF")){
            System.out.println(str.indexOf(s));
            s = br.readLine();
        }
    }
}
