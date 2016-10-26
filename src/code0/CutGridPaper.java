package code0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/26.
 */
public class CutGridPaper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            List<Integer> list0 = new ArrayList<>();
            List<Integer> list1 = new ArrayList<>();
            String inputStr;
            String strs[];
            for(int i=0; i<n; i++){
                inputStr = sc.nextLine();
                strs = inputStr.split(" ");
                list0.add(Integer.parseInt(strs[0]));
                list1.add(Integer.parseInt(strs[1]));
            }
            Collections.sort(list0);
            Collections.sort(list1);
            int diff0 = list0.get(list0.size()-1)-list0.get(0);
            int diff1 = list1.get(list1.size()-1)-list1.get(0);
            if(diff0>diff1){
                System.out.print(diff0*diff0);
            }else{
                System.out.print(diff1*diff1);
            }
        }
    }
}
