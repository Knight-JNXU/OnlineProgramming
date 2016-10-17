package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * http://www.nowcoder.com/practice/a386fd3a5080435dad3252bac76950a7?tpId=49&tqId=29280&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Coder {

    @Test
    public void test(){
        findCoder(new String[]{"i am a coder", "Coder Coder", "Code"}, 3);
    }

    private class CoderClass{
        public String str;
        public int index;
        public int times;  //coder出现次数
    }

    private class MyComparator implements Comparator<CoderClass>{

        @Override
        public int compare(CoderClass c1, CoderClass c2) {
            if(c1.times > c2.times){
                return -1;
            }else{
                if(c1.times < c2.times){
                    return 1;
                }else{
                    if(c1.index > c2.index){
                        return 1;
                    }else{
                        if(c1.index < c2.index){
                            return -1;
                        }else{
                            return 0;
                        }
                    }
                }
            }
        }
    }

    public String[] findCoder(String[] A, int n) {
        List<CoderClass> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int times = 0;
            for(int j=0; j<A[i].length()-4; j++){
                if(A[i].charAt(j)=='c' || A[i].charAt(j)=='C'){
                    if(A[i].charAt(j+1)=='o' || A[i].charAt(j+1)=='O'){
                        if(A[i].charAt(j+2)=='d' || A[i].charAt(j+2)=='D'){
                            if(A[i].charAt(j+3)=='e' || A[i].charAt(j+3)=='E'){
                                if(A[i].charAt(j+4)=='r' || A[i].charAt(j+4)=='R'){
                                    times++;
                                    j=j+4;
                                }
                            }
                        }
                    }
                }
            }
            if(times > 0){
                CoderClass temp = new CoderClass();
                temp.str = A[i];
                temp.index = i;
                temp.times = times;
                list.add(temp);
            }
        }
        Collections.sort(list, new MyComparator());
        String[] target = new String[list.size()];
        int targetP = 0;
        for(CoderClass coder : list){
            target[targetP] = coder.str;
            targetP++;
            System.out.println(coder.str);
        }
        return target;
    }

    public boolean isCoder(String str){
        if(str.length() != 5){
            return false;
        }else{
            if((str.charAt(0)=='c' || str.charAt(0)=='C')
                    && str.charAt(1)=='o' || str.charAt(1)=='O'
                    && str.charAt(2)=='d' || str.charAt(2)=='D'
                    && str.charAt(3)=='e' || str.charAt(3)=='E'
                    && str.charAt(4)=='r' || str.charAt(4)=='R'){
                return true;
            }else{
                return false;
            }
        }
    }
}
