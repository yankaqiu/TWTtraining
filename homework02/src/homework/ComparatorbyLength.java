package homework;

import java.util.Comparator;

public class ComparatorbyLength implements Comparator {
    //重写Compare方法
    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        int a=s1.length()-s2.length();
        return a==0? s1.compareTo(s2):a;
    }
}
