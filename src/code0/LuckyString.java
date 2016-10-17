package code0;

import java.util.*;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * http://www.nowcoder.com/practice/9ef1046e746248fe93751e37126bb9e0?tpId=49&tqId=29234&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class LuckyString {

    public static class MyComparator implements Comparator<String>{

        @Override
        public int compare(String s1, String s2) {
            if(s1.compareTo(s2)>0){
                return 1;
            }else{
                if(s1.compareTo(s2)<0){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String inputStr = sc.nextLine();
            Set<String> sets = new HashSet<>();
            for(int i=0; i<=inputStr.length(); i++){
                for(int j=i+1; j<=inputStr.length(); j++){
                    sets.add(inputStr.substring(i, j));
                }
            }
            List<String> list = new ArrayList<>(sets);
            Collections.sort(list, new MyComparator());
            for(String s : list){
                System.out.println(s);
            }
        }
    }
}
