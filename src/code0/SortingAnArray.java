package code0;

import java.util.*;

/**
 * Created by Knight_JXNU on 2016/10/12.
 * http://www.nowcoder.com/practice/72d0910e837a4a6e95c7f4d60e6d0e68?rp=2&ru=/activity/oj&qru=/ta/kaoyan/question-ranking
 */
public class SortingAnArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            String inputStr = sc.nextLine();
            int n = Integer.parseInt(inputStr);
            inputStr = sc.nextLine();
            String strs[] = inputStr.split(" ");
            int originArray[] = new int[n];
            HashSet<Integer> hashSet = new HashSet<>();
            for(int i=0; i<n; i++){
                originArray[i] = Integer.parseInt(strs[i]);
                hashSet.add(new Integer(Integer.parseInt(strs[i])));
            }
            List<Integer> list = new ArrayList<>(hashSet);
            Collections.sort(list);
            for(int j=0; j<originArray.length; j++){
                for(int i=0; i<list.size(); i++){
                    if(originArray[j] == list.get(i)){
                        System.out.print((i+1) + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
