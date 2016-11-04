package code0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/9/21.
 * 华为机试：24点
 */
public class Cal24 {

    private static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while(sc.hasNextLine()){
            inputStr = sc.nextLine();
            if(inputStr.contains("joker") || inputStr.contains("JOKER")){
                System.out.println("ERROR");
            }else{
                String strs[] = inputStr.split(" ");
                LinkedList<Integer> array = new LinkedList<>();
                for (String s : strs){
                    array.add(change2Int(s));
                }
                getAllArrays(new ArrayList<Integer>(), array);
                for(List<Integer> itemList : lists){
                    for(int i : itemList){
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void getAllArrays(List<Integer> tempArray, List<Integer> list){
        if(list.size() == 1){
            tempArray.add(list.get(0));
            lists.add(tempArray);
            return;
        }else{
            for(int i=0; i<list.size(); i++){
                List<Integer> currList = list;
                List<Integer> tempList = tempArray;
                currList.remove(i);
                tempList.add(list.get(i));
                getAllArrays(tempArray, currList);
            }
        }
    }

    public static int change2Int(String s){
        switch (s){
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 1;
        }
        return -1;
    }
}
