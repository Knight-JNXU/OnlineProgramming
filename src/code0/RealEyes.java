package code0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Knigh on 2016/10/11.
 * http://www.nowcoder.com/practice/d311403b15b8495b81b622edaefd5b5a?tpId=49&tqId=29312&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
class AnswerTable{
    public int askID;
    public int answerNum;
    public List<Integer> answerIDs;
    public String answerIDsStr;
}
public class RealEyes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String inputStr = sc.nextLine();
            int n = Integer.parseInt(inputStr);
            int maxID = 1000000;
            int answer[][] = new int[maxID][maxID];
            List<AnswerTable> list = new ArrayList<>();
            for(int t=0; t<n; t++){
                inputStr = sc.nextLine();
                String strs[] = inputStr.split(" ");
                AnswerTable temp = new AnswerTable();
                temp.askID = Integer.parseInt(strs[0]);
                temp.answerNum = Integer.parseInt(strs[1]);
                List<Integer> tempIDsList = new ArrayList<>();
                String tempAnswerIDsStr = "";
                for(int i=2; i<strs.length; i++){
                    answer[Integer.parseInt(strs[0])][Integer.parseInt(strs[i])] = 1;
                    tempIDsList.add(Integer.parseInt(strs[i]));
                    tempAnswerIDsStr += strs[i]+",";
                }
                temp.answerIDs = tempIDsList;
                temp.answerIDsStr = tempAnswerIDsStr;
                list.add(temp);
            }
            int cheatIDs[] = new int[maxID];
            int cheatCouple[][] = new int[maxID][2];
            int cheatCoupleIndex = 0;
            for(int i=0; i<maxID; i++){
                for(int j=0; j<maxID; j++){
                    if(answer[i][j]==1 && answer[j][i]==1){
                        cheatCouple[cheatCoupleIndex][0] = i;
                        cheatCouple[cheatCoupleIndex][1] = j;
                        cheatCoupleIndex++;
                        cheatIDs[i] = 1;
                        cheatIDs[j] = 1;
                    }
                }
            }
            int cheatPerson[] = new int[maxID];
            int cheatPersonIndex = 0;
            for(AnswerTable item : list){
                for(int i=0; i<cheatCoupleIndex; i++){
                    if(item.answerIDsStr.contains(cheatCouple[i][0]+",")
                            && item.answerIDsStr.contains(cheatCouple[i][1]+",")){
                        cheatPerson[cheatPersonIndex] = item.askID;
                        cheatPersonIndex++;
                        cheatIDs[item.askID] = 1;
                    }
                }
            }
            for(int i=0; i<maxID; i++){
                if(cheatIDs[i] == 1){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
