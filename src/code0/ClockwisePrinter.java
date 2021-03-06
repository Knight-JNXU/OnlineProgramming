package code0;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 顺时针打印矩阵
 * http://www.nowcoder.com/practice/97e7a475d2a84eacb60ee545597a8407?tpId=49&tqId=29372&rp=6&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class ClockwisePrinter {

    @Test
    public void test(){
//        System.out.println(Arrays.toString(clockwisePrint(new int[][]{{1,2},{3,4}},2,2)));
        System.out.println(Arrays.toString(clockwisePrint(new int[][]{{4,46,89},{28,66,99},{26,21,71}},3,3)));
    }

    public int[] clockwisePrint(int[][] mat, int n, int m) {
        int arr[] = new int[n*m];
        int takeInNum = 0;
        int i=0, j=-1;
        int right=0, down=1, left=2, up=3;
        int direction = right;
        while (takeInNum < n*m){
            if(direction==right){
                j++;
                if(j>=m || mat[i][j]==Integer.MAX_VALUE){
                    direction=down;
                    j--;
                }
            }
            if(direction==down){
                i++;
                if(i>=n || mat[i][j]==Integer.MAX_VALUE){
                    direction=left;
                    i--;
                }
            }
            if(direction==left){
                j--;
                if(j<0 || mat[i][j]==Integer.MAX_VALUE){
                    direction=up;
                    j++;
                }
            }
            if(direction==up){
                i--;
                if(i<0 || mat[i][j]==Integer.MAX_VALUE){
                    direction=right;
                    i++;
                }
            }
            if(mat[i][j]!=Integer.MAX_VALUE){
                arr[takeInNum++] = mat[i][j];
                mat[i][j] = Integer.MAX_VALUE;
            }
        }
        return arr;
    }
}
