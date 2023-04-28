public class Main {
    public static void main(String[] args) {
        MyPriorityQueue<String> y = new MyPriorityQueue<>();
        y.enQueue("А");
        y.enQueue("В");
        y.enQueue("Б");
        y.enQueue("Д");
        y.enQueue("Г");
        y.enQueue("оо");
        y.print();
        y.pop();
        y.print();
        System.out.println(y.peek());
    }
}