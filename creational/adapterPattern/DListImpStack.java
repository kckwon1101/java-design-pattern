package creational.adapterPattern;

public class DListImpStack<T> extends DList<T> implements Stack<T> {
    public void push(T o) {
        insertTail(o);
    }

    public T pop() {
        return removeTail();
    }

    public T top() {
        return getTail();
    }
}
