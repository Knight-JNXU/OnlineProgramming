package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/9/26.
 * http://www.nowcoder.com/practice/3897c2bcc87943ed98d8e0b9e18c4666?tpId=49&tqId=29275&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class MaxScore {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            int N = Integer.parseInt(strs[0]);
            int M = Integer.parseInt(strs[1]);
            int array[] = new int[N];
            inputStr = sc.nextLine();
            strs = inputStr.split(" ");
            for(int i=0; i<N; i++){
                array[i] = Integer.parseInt(strs[i]);
            }
            int left, right, max;
            for(int t=0; t<M; t++){
                inputStr = sc.nextLine();
                strs = inputStr.split(" ");
                left = Integer.parseInt(strs[1]);
                right = Integer.parseInt(strs[2]);
                if(strs[0].equals("Q")){
                    if(left > right){
                        int temp = left;
                        left = right;
                        right = temp;
                    }
                    max = array[left-1];
                    for(int i=left; i<right; i++){
                        if(array[i] > max){
                            max = array[i];
                        }
                    }
                    System.out.println(max);
                }else{
                    if(strs[0].equals("U")){
                        array[left-1] = right;
                    }
                }
            }
        }
    }
}
