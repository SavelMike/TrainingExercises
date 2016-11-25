package Week1;


public class CounterTester {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.setLimit(3);
        c.count();
        c.count();
        c.count();
        c.count();
        c.undo();
        c.undo();
        c.undo();
        System.out.println(c.getValue());
        }
}

