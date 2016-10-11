package code0;

import java.util.Scanner;

/**
 * Created by Knigh on 2016/10/11.
 * http://www.nowcoder.com/practice/f9533a71aada4f35867008be22be5b6e?tpId=49&tqId=29296&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
class Num{
    public int index;
    public Num next;

    public Num(int index) {
        this.index = index;
    }
}
public class DeleteNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String inputStr = sc.nextLine();
            int n = Integer.parseInt(inputStr);
            Num head = new Num(0);
            Num curr = head;
            for(int i=1; i<n; i++){
                Num temp = new Num(i);
                curr.next =temp;
                curr = temp;
            }
            curr.next = head;
            Num first = new Num(-1);
            first.next = head;
            curr = first;
            while (curr.next != null){
                curr = curr.next.next;
//                System.out.println("delete index:" + curr.next.index);
                curr.next = curr.next.next;
                if(curr.next == curr){
                    break;
                }
            }
            System.out.println(curr.index);
        }
    }
}
