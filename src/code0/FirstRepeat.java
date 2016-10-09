package code0;

/**
 * Created by Knight_JXNU on 2016/10/9.
 */
public class FirstRepeat {

    public static void main(String args[]){
//        findFirstRepeat("abc", 3);
    }

    public char findFirstRepeat(String A, int n){
        char chars[] = A.toCharArray();
        int arrayLen = 500;
        int[] array = new int[arrayLen];
        for(int i=0; i<n; i++){
            if(array[(int)chars[i]] > 0){
                return chars[i];
            }else{
                array[(int)chars[i]]++;
            }
        }
        return ' ';
    }


}
