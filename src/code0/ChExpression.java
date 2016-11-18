package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/18.
 * 表达式合法判断
 * http://www.nowcoder.com/practice/227893ccf81d4e8589875922f0d9319e?tpId=49&tqId=29299&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * 看到成绩最好的大神用的“栈”，突然发现自己好蠢
 */
public class ChExpression {

    @Test
    public void test(){
        System.out.println(chkLegal("[a+b*(5-4)]*{x+b+b*(({1+2)}}"));
    }

    public boolean chkLegal(String A) {
        if(!checkBracketsMatch(A)){
            return false;
        }
        return true;
    }

    /**
     * 判断是否是运算符或者括号
     * @param c
     * @return
     */
    private boolean isOperatorBracket(char c){
        if(c=='*' || c=='/' || c=='+' || c=='-'
                || c=='{' || c=='}' || c=='[' || c==']'
                || c=='(' || c==')'){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 检查括号是否匹配，如果匹配返回true，如果不匹配，返回false
     * @param str
     * @return
     */
    private boolean checkBracketsMatch(String str){
        int bigNL = 0;  //左大括号
        int bigNR = 0;  //右大括号
        int midNL = 0;  //左中括号
        int midNR = 0;  //右中括号
        int smalNL = 0;  //左小括号
        int smalNR = 0;  //右小括号
        List<Integer> bigLList = new ArrayList<>();  //左大括号位置列表
        List<Integer> bigRList = new ArrayList<>();  //右大括号位置列表
        List<Integer> midLList = new ArrayList<>();  //左中括号位置列表
        List<Integer> midRList = new ArrayList<>();  //右中括号位置列表
        List<Integer> smalLList = new ArrayList<>();  //左小括号位置列表
        List<Integer> smalRList = new ArrayList<>();  //右小括号位置列表
        char chars[] = str.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i]=='{'){
                if(i-1>=0 && !isOperatorBracket(chars[i-1])){
                    return false;
                }
                bigLList.add(i);
                bigNL++;
            }else {
                if(chars[i]=='}'){
                    if(i+1<chars.length && !isOperatorBracket(chars[i+1])){
                        return false;
                    }
                    bigRList.add(i);
                    bigNR++;
                }else{
                    if(chars[i]=='['){
                        if(i-1>=0 && !isOperatorBracket(chars[i-1])){
                            return false;
                        }
                        midLList.add(i);
                        midNL++;
                    }else{
                        if(chars[i]==']'){
                            if(i+1<chars.length && !isOperatorBracket(chars[i+1])){
                                return false;
                            }
                            midRList.add(i);
                            midNR++;
                        }else{
                            if(chars[i]=='('){
                                if(i-1>=0 && !isOperatorBracket(chars[i-1])){
                                    return false;
                                }
                                smalLList.add(i);
                                smalNL++;
                            }else{
                                if(chars[i]==')'){
                                    if(i+1<chars.length && !isOperatorBracket(chars[i+1])){
                                        return false;
                                    }
                                    smalRList.add(i);
                                    smalNR++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(bigNL==bigNR && midNL==midNR && smalNL==smalNR){
            for(int i=0; i<bigLList.size(); i++){
                if(bigLList.get(i)>bigRList.get(i)){
                    return false;
                }
            }
            for(int i=0; i<midLList.size(); i++){
                if(midLList.get(i)>midRList.get(i)){
                    return false;
                }
            }
            for(int i=0; i<smalLList.size(); i++){
                if(smalLList.get(i)>smalRList.get(i)){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
