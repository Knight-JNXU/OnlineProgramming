package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * http://www.nowcoder.com/practice/ae809795fca34687a48b172186e3dafe?tpId=37&tqId=21234&rp=&ru=/ta/huawei&qru=/ta/huawei/question-ranking
 */
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String inputStr = sc.nextLine();
            int maxIndex = inputStr.length()-1;
            for(int i=0; i<=maxIndex; i++){
                System.out.print(inputStr.charAt(maxIndex-i));
            }
            System.out.println();
        }
    }
}
