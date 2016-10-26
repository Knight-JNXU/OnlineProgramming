package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2016/10/26.
 * http://www.nowcoder.com/practice/5541c433dee04c17ba7774c4a20430de?tpId=49&tqId=29303&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class ChkBloodType {

    @Test
    public void test(){
//        String strs[] = chkBlood("A", "A");
//        String strs[] = chkBlood("AB","AB");
        String strs[] = chkBlood("AB","B");
        for(String s : strs){
            System.out.println(s);
        }
    }

    public String[] chkBlood(String father, String mother) {
        if(father.equals("O") && mother.equals("O")){
            return new String[]{"O"};
        }else{
            if((father.equals("A")&&mother.equals("O")) || (mother.equals("A")&&father.equals("O"))){
                return new String[]{"A", "O"};
            }else{
                if(father.equals("A")&&mother.equals("A")){
                    return new String[]{"A", "O"};
                }else{
                    if((father.equals("A")&&mother.equals("B")) || (father.equals("B")&&mother.equals("A"))){
                        return new String[]{"A", "AB", "B", "O"};
                    }else{
                        if((father.equals("A")&&mother.equals("AB")) || father.equals("AB")&&mother.equals("A")){
                            return new String[]{"A", "AB", "B"};
                        }else{
                            if((father.equals("B")&&mother.equals("O")) || (father.equals("O")&&mother.equals("B"))){
                                return new String[]{"B", "O"};
                            }else{
                                if(father.equals("B")&&mother.equals("B")){
                                    return new String[]{"B", "O"};
                                }else{
                                    if((father.equals("B")&&mother.equals("AB")) || (father.equals("AB")&&mother.equals("B"))){
                                        return new String[]{"A", "AB", "B"};
                                    }else{
                                        if((father.equals("AB")&&mother.equals("O")) || (father.equals("O")&&mother.equals("AB"))){
                                            return new String[]{"A", "B"};
                                        }else{
                                            if(father.equals("AB")&&mother.equals("AB")){
                                                return new String[]{"A", "AB", "B"};
                                            }else{
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
