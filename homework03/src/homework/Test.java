package homework;

import java.util.*;

public class Test {


    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        Queue<String> myqueue = new Queue<>(list);
        VisitImplement<String> v = new VisitImplement<>();
        myqueue.enQueue("a");
        myqueue.enQueue("b");
        myqueue.enQueue("c");
        myqueue.enQueue("d");

        System.out.println(myqueue.length());
        System.out.println(myqueue.deQueue());
        System.out.println(myqueue.deQueue());
        myqueue.traverse(v);

        myqueue.enQueue("e");
        myqueue.enQueue("f");
        myqueue.enQueue("g");
        myqueue.enQueue("h");

        myqueue.traverse(v);
        System.out.println(myqueue.length());
        System.out.println(myqueue.deQueue());
        System.out.println(myqueue.deQueue());

    }
}
