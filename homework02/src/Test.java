import homework.ComparatorbyLength;
import homework.HomeworkThree;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HomeworkThree h =new HomeworkThree();
        List<String> l=new LinkedList<String>();
        l.add("ABc");
        l.add("Bcd");
        l.add("cds");
        l.add("ABsd");
        l.add("ABc");
        System.out.println(h.startwithA(l));
        System.out.println("......................");
        l.add("ABc");
        l.add("Bcd");
        l.add("cds");
        l.add("ABsd");
        l.add("ABc");
        System.out.println(h.dataprocessing(l));
        System.out.println(".......................");
        l.add("AB");
        l.add("Bcd");
        l.add("cd");
        l.add("ABsd");
        l.add("ABc");
        System.out.println(h.deduplicate(l));
        System.out.println(".......................");

    }
}
