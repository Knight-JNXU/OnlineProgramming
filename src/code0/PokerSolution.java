package code0;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/15.
 * 扑克牌大小
 * http://www.nowcoder.com/practice/0a92c75f5d6b4db28fcfa3e65e5c9b3f?tpId=49&tqId=29277&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class PokerSolution {
    private static boolean flag = false;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String inputStr = sc.nextLine();
            String strs[] = inputStr.split("-");
            String poker1[] = strs[0].split(" ");
            String poker2[] = strs[1].split(" ");
            //对王
            if(hasDoubelKing(poker1)){
                printPoker(poker1);
            }
            if(hasDoubelKing(poker2)){
                printPoker(poker2);
            }
            if(!flag){
                //炸弹
                int bom1 = getBombValue(poker1);
                int bom2 = getBombValue(poker2);
                if(bom1 > bom2){
                    printPoker(poker1);
                }
                if(bom1 < bom2){
                    printPoker(poker2);
                }
                if(!flag && bom1==bom2){
                    //三个
                    int three1 = getThreeValue(poker1);
                    int three2 = getThreeValue(poker2);
                    if(three1!=-1 && three2!=-1){
                        if(three1 > three2){
                            printPoker(poker1);
                        }
                        if(three1 < three2){
                            printPoker(poker2);
                        }
                    }
                    if(!flag && bom1==bom2 && three1==three2){
                        //对子
                        int two1 = getTwoValue(poker1);
                        int two2 = getTwoValue(poker2);
                        if(two1!=-1 && two2!=-1){
                            if(two1 > two2){
                                printPoker(poker1);
                            }
                            if(two1 < two2){
                                printPoker(poker2);
                            }
                        }
                        if(!flag && bom1==bom2 && three1==three2 && two1==two2){
                            //顺子
                            int junko1 = getJunko(poker1);
                            int junko2 = getJunko(poker2);
                            if(junko1!=-1 && junko2!=-1){
                                if(junko1 > junko2){
                                    printPoker(poker1);
                                }
                                if(junko1 < junko2){
                                    printPoker(poker2);
                                }
                            }
                            if(!flag && bom1==bom2 && three1==three2 && two1==two2 && junko1==junko2){
                                //个子
                                int one1 = getMaxOne(poker1);
                                int one2 = getMaxOne(poker2);
                                if(one1!=-1 && one2!=-1){
                                    if(one1 > one2){
                                        printPoker(poker1);
                                    }
                                    if(one1 < one2){
                                        printPoker(poker2);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if(!flag){
                System.out.println("ERROR");
            }
            flag = false;
        }
    }

    /**
     * 输出poker
     * @param poker
     */
    private static void printPoker(String poker[]){
        for (int i=0; i<poker.length-1; i++){
            System.out.print(poker[i]+" ");
        }
        System.out.print(poker[poker.length-1]);
        System.out.println();
        flag = true;
    }

    /**
     * 获取对王，找到返回true，没找到返回false
     * @param poker
     * @return
     */
    private static boolean hasDoubelKing(String poker[]){
        int n = 0;
        for(int i=0; i<poker.length; i++){
            if(poker[i].equals("joker") || poker[i].equals("JOKER")){
                n++;
            }
        }
        if(n == 2){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 获取最大的炸弹，没找到返回-1
     * @param poker
     * @return
     */
    private static int getBombValue(String poker[]){
        int i = 0;
        int bomValue = -1;
        while (i<poker.length){
            if(getSameNum(poker, i, poker[i])==4){
                int temp = poker2Value(poker[i]);
                if(temp > bomValue){
                    bomValue = temp;
                }
                i += 4;
            }else{
                i++;
            }
        }
        return bomValue;
    }

    /**
     * 获取最大的三个，没找到返回-1
      * @param poker
     * @return
     */
    private static int getThreeValue(String poker[]){
        int i = 0;
        int bomValue = -1;
        while (i<poker.length){
            if(getSameNum(poker, i, poker[i])==3){
                int temp = poker2Value(poker[i]);
                if(temp > bomValue){
                    bomValue = temp;
                }
                i += 3;
            }else{
                i++;
            }
        }
        return bomValue;
    }

    /**
     * 获取最大的对个，没找到返回-1
      * @param poker
     * @return
     */
    private static int getTwoValue(String poker[]){
        int i = 0;
        int bomValue = -1;
        while (i<poker.length){
            if(getSameNum(poker, i, poker[i])==2){
                int temp = poker2Value(poker[i]);
                if(temp > bomValue){
                    bomValue = temp;
                }
                i += 2;
            }else{
                i++;
            }
        }
        return bomValue;
    }

    /**
     * 获取顺子的大小
     * @param poker
     * @return
     */
    private static int getJunko(String poker[]){
        int junkoValue = -1;
        for(int i=0; i<poker.length-1; i++){
            if(isJunko(poker, i) >= 5){
                return poker2Value(poker[i]);
            }
        }
        return junkoValue;
    }

    /**
     * 后面是否含有顺子
     * @param poker
     * @param start
     * @return
     */
    private static int isJunko(String poker[], int start){
        int n = 0;
        int i = start;
        while(i<(poker.length-1)){
            if((poker2Value(poker[i+1])-poker2Value(poker[i]))==1){
                i++;
                n++;
            }else{
                if((poker2Value(poker[i+1])-poker2Value(poker[i]))==0){
                    i++;
                }else{
                    break;
                }
            }
        }
        return n;
    }

    /**
     * 获取最大的个子
     * @param poker
     * @return
     */
    private static int getMaxOne(String poker[]){
        int max = -1;
        for(int i=0; i<poker.length; i++){
            if(poker2Value(poker[i]) > max){
                max = poker2Value(poker[i]);
            }
        }
        return max;
    }


    /**
     * 获取相同牌面的牌数
     * @param poker
     * @param start
     * @param value
     * @return
     */
    private static int getSameNum(String poker[], int start, String value){
        int sum = 1;
        for(int i=start+1; i<poker.length; i++){
            if((poker[i]).equals(value)){
                sum++;
            }
        }
        return sum;
    }

    /**
     * 把牌转换成值
     * @param str
     * @return
     */
    private static int poker2Value(String str){
        switch (str){
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
                return 14;
            case "2":
                return 15;
            case "joker":
                return 16;
            case "JOKER":
                return 17;
            default:
                return -1;
        }
    }
}
