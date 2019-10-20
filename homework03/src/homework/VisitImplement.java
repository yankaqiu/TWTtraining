package homework;

public class VisitImplement<T> implements Visit<T> {
    @Override
    public void operate(T t) {
        System.out.println(t.toString());
    }
}
