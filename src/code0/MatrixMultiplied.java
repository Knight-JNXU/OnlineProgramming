package code0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/15.
 * 矩阵元素相乘
 * http://www.nowcoder.com/practice/935fbb71542345ef87a7acc190e2577b?tpId=49&tqId=29313&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class MatrixMultiplied {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            int n = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);
            int matrix[][] = new int[n][m];
            long rowResult[] = new long[n];
            long colResult[] = new long[m];
            List<Long> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                rowResult[i] = 1;
            }
            for(int i=0; i<m; i++){
                colResult[i] = 1;
            }
            for(int i=0; i<n; i++){
                inputStr = sc.nextLine();
                strs = inputStr.split(" ");
                for(int j=0; j<m; j++){
                    int temp = Integer.parseInt(strs[j]);
                    matrix[i][j] = temp;
                    rowResult[i] *= temp;
                    colResult[j] *= temp;
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    list.add(rowResult[i]*colResult[j]/(matrix[i][j]*matrix[i][j]));
                }
            }
            Collections.sort(list);
            System.out.println(list.get(list.size()-1));
        }
    }
}
