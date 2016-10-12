package code0;

import java.util.*;

/**
 * Created by Knight_JXNU on 2016/10/12.
 * http://www.nowcoder.com/practice/7a2f7d304d9e43b1bb2a6e72ed65bf51?rp=1&ru=/activity/oj&qru=/ta/kaoyan/question-ranking
 */
public class SortResults {

    private static class Student{
        public String name;
        public int age;
        public int score;

        public Student(String name, int age, int score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }
    }

    static class MyComparater implements Comparator<Student>{
        @Override
        public int compare(Student t1, Student t2) {
            if(t1.score > t2.score){
                return 1;
            }else{
                if(t1.score < t2.score){
                    return -1;
                }else{
                    if(t1.name.compareTo(t2.name) > 0){
                        return 1;
                    }else{
                        if(t1.name.compareTo(t2.name) < 0){
                            return -1;
                        }else{
                            if(t1.age > t2.age){
                                return 1;
                            }else{
                                if(t1.age < t2.age){
                                    return -1;
                                }else {
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String inputStr;
            Student list[] = new Student[n];
            for(int t=0; t<n; t++){
                inputStr = sc.nextLine();
                String strs[] = inputStr.split(" ");
                list[t] = (new Student(strs[0],
                        Integer.parseInt(strs[1]), Integer.parseInt(strs[2])));
            }
            Comparator cmp = new MyComparater();
            Arrays.sort(list, cmp);
            for(Student s : list){
                System.out.println(s.name + " " + s.age + " " + s.score);
            }
        }
    }

}
