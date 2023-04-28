import java.util.ArrayList;
import java.util.List;

public class MyPriorityQueue<T>  {

    final int SIZE;
    private List<T> items = new ArrayList<>();
    private int front, rear;

    MyPriorityQueue() {
        SIZE = 5;
        front = -1;
        rear = -1;
    }
    MyPriorityQueue(int size) {
        this.SIZE = size;
        front = -1;
        rear = -1;
    }
    void enQueue(T element) {
        if (isFull()) {
            System.out.println("Очередь переполнена!");
            return;
        }
        items.add(element);
        if (items.size() > 1) {
            sortItem();
        }
    }

    private void sortItem() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < items.size(); i++) {
                Comparable<? super T> k = (Comparable<? super T>) items.get(i);
                int cmp = k.compareTo(items.get(i - 1));
                if (cmp < 0) {
                    T temp = items.get(i);
                    items.set(i, items.get(i - 1));
                    items.set(i - 1, temp);
                    isSorted = false;
                }
            }
        }
    }
    public void pop() {
        items.remove(0);
    }

    public T peek() {
        return items.get(0);
    }

    public boolean isFull() {
        if (items.size() == SIZE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (items.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println(items.toString());
    }
}
