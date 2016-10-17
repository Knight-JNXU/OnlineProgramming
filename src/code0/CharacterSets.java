package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * http://www.nowcoder.com/practice/784efd40ed8e465a84821c8f3970b7b5?tpId=49&tqId=29297&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class CharacterSets {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int letterArray[] = new int['z'-'A'+1];
            String inputStr = sc.nextLine();
            char chars[] = inputStr.toCharArray();
            String target = "";
            for(char c : chars){
                if(letterArray[c-'A']!=1){
                    target += c;
                    letterArray[c-'A']=1;
                }
            }
            System.out.println(target);
        }
    }
}
