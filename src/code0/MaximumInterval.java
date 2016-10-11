package code0;

import java.util.Scanner;

/**
 * Created by Knigh on 2016/10/11.
 * http://www.nowcoder.com/practice/3a571cdc72264d76820396770a151f90?tpId=49&tqId=29292&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class MaximumInterval {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String inputStr = sc.nextLine();
            int n = Integer.parseInt(inputStr);
            inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            int array[] = new int[n];
            for(int i=0; i<n; i++){
                array[i] = Integer.parseInt(strs[i]);
            }
            // 没有去掉 ai 时的所有间隔
            int distances[] = new int[n-1];
            for(int i=0; i<n-1; i++){
                distances[i] = array[i+1]-array[i];
            }
            int minMaxDistance = distances[0];
            for(int i=0; i<n-1; i++){
                if(minMaxDistance < distances[i]){
                    minMaxDistance = distances[i];
                }
            }
            System.out.println(minMaxDistance);
        }
    }
}
