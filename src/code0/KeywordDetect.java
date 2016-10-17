package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * http://www.nowcoder.com/practice/6b372fae97c84c3681d2be03923e7eaa?tpId=49&tqId=29302&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class KeywordDetect {

    @Test
    public void test(){
//        int array[] = (containKeyword((new String[]{"nowcoder","hello","now"}), 3,
//                (new String[]{"coder","now"}), 2));
        int array[] = (containKeyword(new String[]{"uauqsesb","uwywfprxptxpmgqwuphqtd","yibhwmzltswkoxmslparsggkakblrghmflnurwmcyrgburmx","ngidwcvnxxcyaeiahagxywwodqpixtkboigxdfqoqjgcwizj","mixlhfnqlunpnbtorov","wdwcqseyoopvuicakehitqdtz","eivqoollveiyuxgwzinihcqrjlfmscfkligkfhmmbp","oicotgbgrzswvbquxqogbpmff","luifkizyznhseoyforvfzopcudkyofpvkrfyrk","ahvyasyoxhrnjbfslmgdyrgfontvufxqq","gjxyfwqmxczwzecdkjwxkcsmjrbevszwfnubyzlshslslfjiqsatsq","wsbslwfrhpjexfmphkbhfwpeflaujhuoztshhiwpfzunx","upmqjvoywvcpbhmmrhqhursosxl","jjjkcxkbvmhzzrz","dkdvqryuufjrosrzl","pzprmccuq","ijiinpcnhuleqxhmpgcvyzgkg","esopsgamiuzyxtyzvcrtwkotiiakrargihlpsx","cmct","jqajtvesmuiaxbcgrakttzbywclanbjvawfzn","jxgdbjob","aub","ejwaihklobckvglgdhhjhomfzlfumkavrmelfmaodd","mqswknxf"},24,new String[]{"z","s","h","e","th","b","e","qo"},8));
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public int[] containKeyword(String[] A, int n, String[] keys, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            boolean findFlag = false;
            for(int j=0; j<m; j++){
                while(A[i].indexOf(keys[j])!=-1){
                    findFlag = true;
                    break;
                }
                if(findFlag){
                    break;
                }
            }
            if(findFlag){
                list.add(i);
            }
        }
        Collections.sort(list);
        int[] array;
        if(list.size() > 0){
            array = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                array[i] = list.get(i).intValue();
            }
        }else{
            array = new int[]{-1};
        }
        return array;
    }
}
