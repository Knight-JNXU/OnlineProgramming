package code0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Knight_JXNU on 2016/10/17. Main
 */
public class LastChar {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){
            String inputStr = br.readLine();
            if(inputStr.length() == 1){
                System.out.println(inputStr);
            }else{
                for(int i=0; i<inputStr.length()-1; i++){
                    if(inputStr.indexOf(inputStr.substring(i, i+1), i+1) == -1){
                        System.out.println(inputStr.substring(i, i+1));
                        break;
                    }
                }
            }
        }
    }
}
