package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/18.
 * 棋子翻转
 * http://www.nowcoder.com/practice/0b5ab6cc51804dd59f9988ad70d8c4a0?tpId=49&tqId=29282&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Flip {
    private void print(int[][] A){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    @Test
    public void test(){
        print(flipChess(new int[][]{{0,0,1,1},{1,0,1,0},{0,1,1,0},{0,0,1,0}},new int[][]{{2,2},{3,3},{4,4}}));
    }

    public int[][] flipChess(int[][] A, int[][] f) {
        int row, col;
        for(int i=0; i<3; i++){
            //上
            row = f[i][0]-1-1;
            col = f[i][1]-1;
            if(row>=0){
                A[row][col] = change(A[row][col]);
            }
            //下
            row = f[i][0]+1-1;
            col = f[i][1]-1;
            if(row<A.length){
                A[row][col] = change(A[row][col]);
            }
            //左
            row = f[i][0]-1;
            col = f[i][1]-1-1;
            if(col>=0){
                A[row][col] = change(A[row][col]);
            }
            //右
            row = f[i][0]-1;
            col = f[i][1]+1-1;
            if(col<A.length){
                A[row][col] = change(A[row][col]);
            }
        }
        return A;
    }
    private int change(int i){
        if(i==0){
            return 1;
        }else{
            return 0;
        }
    }
}
