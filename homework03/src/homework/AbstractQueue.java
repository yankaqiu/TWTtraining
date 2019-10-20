package homework;

import java.util.LinkedList;

public abstract class AbstractQueue<T> {
    protected LinkedList<T> List;

    //清空队列
    public abstract void clearQueue();

    //判断队列是否为空
    public abstract Boolean isEmpty();

    //返回队列的长度
    public abstract int length();

    //返回队头元素
    public abstract T poll();

    //队尾插入一个元素
    public abstract void enQueue(T t);

    //删除队头元素，并返回其值
    public abstract T deQueue();

    //遍历队列，对每一个数据e调用函数Visit.operate(e)
    public abstract void traverse(Visit<T> visit);
}
