package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 小易的升级之路
 * http://www.nowcoder.com/practice/fe6c73cb899c4fe1bdd773f8d3b42c3d?tpId=49&tqId=29329&rp=4&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class XiaoYiUpdateRoad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int a = sc.nextInt();
            sc.nextLine();
            String inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            int b[] = new int[strs.length];
            for(int i=0; i<strs.length; i++){
                b[i] = Integer.parseInt(strs[i]);
            }
            int c = a;
            for(int i=0; i<b.length; i++){
                if(b[i]<=c){
                    c+=b[i];
                }else{
                    c+=getMinDiv(c, b[i]);
                }
            }
            System.out.println(c);
        }
    }

    /**
     * 获取p和q的最小公约数
     * @param p
     * @param q
     * @return
     */
    private static int getMinDiv(int p, int q){
        int min = Math.min(p, q);
        int minMid = min/2;
        int max = Math.max(p, q);
        if((max%min)==0){
            return min;
        }else{
            for(int i=minMid; i>=1; i--){
                if(max%i==0 && min%i==0){
                    return i;
                }
            }
        }
        return -1;
    }
}
