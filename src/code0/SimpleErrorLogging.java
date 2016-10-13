package code0;

import java.util.*;

/**
 * Created by Knight_JXNU on 2016/10/13. Main
 * http://www.nowcoder.com/practice/67df1d7889cf4c529576383c2e647c48?tpId=49&tqId=29276&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class SimpleErrorLogging {

    private static class MyComparator implements Comparator<Record>{
        @Override
        public int compare(Record record, Record t1) {
            if(record.sum > t1.sum){
                return -1;
            }else{
                if(record.sum < t1.sum){
                    return 1;
                }else{
                    if(record.index > t1.index){
                        return 1;
                    }else{
                        if(record.index < t1.index){
                            return -1;
                        }else{
                            return 0;
                        }
                    }
                }
            }
        }
    }

    static class Record{
        public String name;
        public String rowNumber;
        public int sum;
        public int index;

        public Record() {
        }

        public Record(String name, String rowNumber, int index) {
            this.name = name;
            this.rowNumber = rowNumber;
            this.index = index;
            sum = 1;
        }

        @Override
        public boolean equals(Object o) {
            Record r = (Record)o;
            if(r.name.equals(this.name)
                    && r.rowNumber.equals(this.rowNumber)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Record> records = new ArrayList<>();
        Comparator cmp = new MyComparator();
        int index = 0;
        while (sc.hasNext()){
            String intputStr = sc.next();
            if(intputStr.equals("$")) break;
            String strs[] = new String[2];
            strs[0] = intputStr;
            strs[1] = sc.next();
            char cs[] = strs[0].toCharArray();
            int point = 0;
            for(int i=0; i<cs.length; i++){
                if(cs[i] == '\\'){
                    point = i;
                }
            }
            String fileName = "";
            for(int i=point+1; i<cs.length; i++){
                fileName += cs[i];
            }
            String rowNum = strs[1];
            boolean addFlag = false;
            for(Record item : records){
                if(item.name.equals(fileName)
                        && item.rowNumber.equals(rowNum)){
                    item.sum++;
                    addFlag = true;
                }
            }
            if(!addFlag){
                records.add(new Record(fileName, rowNum, index));
                index++;
            }
            Collections.sort(records, cmp);
        }
        int len = 16;
        if(records.size() > 8){
            for(int i=0; i<8; i++){
                Record temp = records.get(i);
                String fileName = temp.name;
                if(fileName.length() > len){
                    fileName=fileName.substring(fileName.length()-len, fileName.length());
                }
                System.out.println(fileName + " " +  temp.rowNumber + " " + temp.sum);
            }
        }else{
            for(Record temp : records){
                String fileName = temp.name;
                if(fileName.length() > len){
                    fileName=fileName.substring(fileName.length()-len, fileName.length());
                }
                System.out.println(fileName + " " +  temp.rowNumber + " " + temp.sum);
            }
        }
    }
}
