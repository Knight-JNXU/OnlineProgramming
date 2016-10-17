package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/10/17.
 */
public class Mixture {

    @Test
    public void test(){
        System.out.println(chkMixture("ABC",3,"12C",3,"A12BCC",6));
    }

    public boolean chkMixture(String A, int n, String B, int m, String C, int v) {
        if(v != (n+m)){
            return false;
        }else{
            if(isContans(A, n, C, v) && isContans(B, m, C, v)){
                return true;
            }else{
                return false;
            }
        }
    }

    public boolean isContans(String S, int l, String C, int v){
        int index = 0;
        for(int i=0; i<v; i++){
            if(S.charAt(index)==C.charAt(i)){
                index++;
            }
            if(index == l){
                return true;
            }
        }
        return false;
    }
}
