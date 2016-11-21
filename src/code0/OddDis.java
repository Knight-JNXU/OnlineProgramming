package code0;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/21.
 * 奇数位丢弃
 * http://www.nowcoder.com/practice/196141ecd6eb401da3111748d30e9141?tpId=49&tqId=29315&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class OddDis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(new Integer(i));
            }
            ArrayList<Integer> result = removeOdd(list);
            System.out.println(result.get(0));
        }
    }

    private static ArrayList<Integer> removeOdd(ArrayList<Integer> list){
        if(list.size()==1){
            return list;
        }else{
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<list.size(); i++){
                if(i%2==1){
                    temp.add(list.get(i));
                }
            }
            return removeOdd(temp);
        }
    }
}
