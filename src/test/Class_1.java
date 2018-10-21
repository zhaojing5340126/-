package test;//一个功能一个包

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Class_1 {
    /**
     * 打印对象，编号为index，
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj.toString()));
    }

    /**
     * 代码包括Java Random，Math，String类相关成员函数的使用，ArrayList，Set，HashMap等各种容器类的使用
     */
    public static void main(String[] args) {
//        demoString();
//        demoList();
//        demoSet();
//        demoMap();
//        demoRandom();
        demoDate();
    }

    private static void demoDate() {
        Date date =new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date);
        DateFormat df = new SimpleDateFormat("yy-MM-dd  HH:mm:ss");
        print(1,df.format(date));
        print(2,DateFormat.getDateInstance(DateFormat.FULL).format(date));
    }

    private static void demoRandom() {
        Random random = new Random();
        random.setSeed(1);
        for (int i = 0; i<4 ;i++){
            print(i,random.nextInt(100));
        }

    }

    private static void demoMap() {
        Map<String,String> map = new HashMap<>();
        for (int i=0; i<4 ;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        for (Map.Entry<String,String> entry: map.entrySet()){
            print(2,entry.getKey() + ":" + entry.getValue());
        }

    }

    private static void demoSet() {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i<4; i++){
            list.add(String.valueOf(i));
        }
        set.addAll(list);
        set.add(String.valueOf(3));
        print(1,set);
    }

    private static void demoList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i<4; i++){
            list.add(String.valueOf(i));
        }
        print(1,list);
        List<String> listb = new ArrayList<>();
        for (int i = 0; i<4; i++){
            listb.add(String.valueOf(i+2));
        }
         listb.addAll(list);
        print(2,listb);
        print(3,list.remove(1));
        print(4,list.get(2));
        Collections.sort(list);
        print(5,list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        Collections.reverse(list);
        print(6,list);
    }

    private static void demoString() {
        String str = "hello world";
        System.out.println(str.substring(1));
        print(1,str.indexOf('e'));
        print(2,str.charAt(1));
        print(3,str.codePointAt(1));
        print(4,str.concat("!!") );
        print(5,str.compareToIgnoreCase("he"));
        print(7,str.contains("e0"));
        print(8,str.replaceAll("o|i","a"));
        print(9,str.toUpperCase());

        StringBuilder sb = new StringBuilder();
        sb.append(true);
        print(10,sb.toString());
        print(11,String.valueOf(3));

    }

}
