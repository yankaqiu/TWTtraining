package homework;
import java.util.*;

public class Queue<T> extends AbstractQueue{
    LinkedList<String> queue=new LinkedList<>();

    public Queue(LinkedList list) {
        super();
    }


    @Override
    public void clearQueue() {
        queue.clear();
    }

    @Override
    public Boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public int length() {
        return queue.size();
    }


    @Override
    public Object poll() {
        return null;
    }

    @Override
    public void enQueue(Object o) {
    this.queue.addLast((String) o);
    }

    @Override
    public Object deQueue() {
        if(!queue.isEmpty()){
            return queue.removeFirst();
        }
        return null;
    }

    @Override
    public void traverse(Visit visit) {
        Visit v=new VisitImplement();
    Iterator it=queue.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            v.operate(element);

    }
    }

}
