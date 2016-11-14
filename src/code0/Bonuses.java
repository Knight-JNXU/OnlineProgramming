package code0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/14.
 * 发奖金
 * http://www.nowcoder.com/practice/acb888f7ccee4fc0aab208393d41a552?tpId=49&tqId=29328&rp=4&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Bonuses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int array[] = new int[n];
            int money[] = new int[n];
            for(int i=0; i<n; i++){
                array[i] = sc.nextInt();
                money[i] = 1;
            }
            boolean changeFlag = true;
            while (changeFlag){
                changeFlag = false;
                for(int i=0; i<n; i++){
                    if(i-1>=0 && array[i]>array[i-1] && money[i]<=money[i-1]){
                        money[i]++;
                        changeFlag = true;
                    }
                    if(i+1<n && array[i]>array[i+1] && money[i]<=money[i+1]){
                        money[i]++;
                        changeFlag = true;
                    }
                }
            }
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += money[i];
            }
            System.out.println(sum);
        }
    }
}
