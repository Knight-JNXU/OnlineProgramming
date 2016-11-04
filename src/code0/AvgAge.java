package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/9/27.
 * http://www.nowcoder.com/practice/3745638815d04c26babcfc463c25478c?tpId=49&tqId=29286&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class AvgAge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String intputStr = sc.nextLine();
            String strs[] = intputStr.split(" ");
            int W = Integer.parseInt(strs[0]);
            double Y = Double.parseDouble(strs[1]);
            double x = Double.parseDouble(strs[2]);
            int N = Integer.parseInt(strs[3]);
            for(int t=0; t<=N; t++){
//                int leftP = (int)Math.ceil (W * x);
                int leftP = (int) (W * x);
//                Y = (Y*W*(1-x)+21*(W-W*(1-x)))/(double) W;
                Y = (Y*(W-leftP)+21*(leftP))/(double) W;
                System.out.println("leftP:"+leftP+",Y:"+Y);
//                Y = Math.ceil(Y);
//                System.out.println("leftP:"+leftP+",Y:"+Y);
            }
            Y = Math.ceil(Y);
//            System.out.println(Y);
        }
    }
}
