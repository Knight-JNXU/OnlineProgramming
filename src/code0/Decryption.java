package code0;

import java.util.*;

/**
 * Created by Knight_JXNU on 2016/10/20.
 * http://www.nowcoder.com/practice/1f16639196e7463189dc6a0e3b968185?tpId=49&tqId=29318&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Decryption {

    private static List<String> target = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String inputStr = sc.nextLine();
            char[] chars = inputStr.toCharArray();
            List<Character> list = new ArrayList<>();
            for(int i=0; i<chars.length; i++){
                list.add(chars[i]);
            }
            getTarget(new StringBuffer(), list);
            Collections.sort(target);
            for(String s : target){
                System.out.println(s);
            }
        }
    }

    public static void getTarget(StringBuffer sb, List<Character> list){
        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                List<Character> temp = new ArrayList<>(list);
                temp.remove(i);
                StringBuffer tempSB = new StringBuffer(sb);
                getTarget(tempSB.append(list.get(i)), temp);
            }
        }else{
            target.add(sb.toString());
        }
    }

}
