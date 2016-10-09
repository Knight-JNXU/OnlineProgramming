package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/9.
 * http://www.nowcoder.com/practice/c61211485dbf495d8d98e91b6e250422?tpId=49&tqId=29304&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class RabbitHiddenHole {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            int x = Integer.parseInt(strs[0])-1;
            int n = Integer.parseInt(strs[1]);
            int[] array = new int[20];
            int addN = 0;
            for(int i=0; i<n; i++){
                x += addN;
                array[x%19]++;
                addN++;
            }
            boolean flag = true;
            for(int i=0; i<20; i++){
                if(array[i] == 0){
                    System.out.print(i+1+" ");
                    flag = false;
                }
            }
            if(flag){
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
