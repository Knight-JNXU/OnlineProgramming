package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/12.
 * http://www.nowcoder.com/practice/cee98a512ec246a2918ea8121f7612c8?tpId=49&tqId=29308&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Scholarship {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            int n = Integer.parseInt(strs[0]);
            int r = Integer.parseInt(strs[1]);
            int avg = Integer.parseInt(strs[2]);
            int array[][] = new int[n][3];
            int diffSum = 0;
            int minB=1000000, maxB=0;
            for(int i=0; i<n; i++){
                inputStr = sc.nextLine();
                strs = inputStr.split(" ");
                int a = Integer.parseInt(strs[0]);
                array[i][0] = a;
                int b = Integer.parseInt(strs[1]);
                array[i][1] = b;
                int diff = r - a;
                diffSum += (avg-a);
                array[i][2] = diff;
                if(b < minB){
                    minB = b;
                }
                if(b > maxB){
                    maxB = b;
                }
            }
            int time = 0;
            boolean continueFlag = true;
            for(int i=minB; i<=maxB; i++){
                for(int j=0; j<n; j++){
                    if(array[j][1] == i){
                        if(diffSum >= array[j][2]){
                            time += array[j][2]*i;
                            diffSum -= array[j][2];
                        }else{
                            time += diffSum*i;
                            diffSum = 0;
                            continueFlag = false;
                            break;
                        }
                    }
                }
                if(!continueFlag){
                    break;
                }
            }
            System.out.println(time);
        }
    }
}
