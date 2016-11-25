package Week1;

/**
 * Created by Михаил on 25.11.2016.
 */
public class Counter {

    private int value;
    private int maxValue;

    public void setLimit(int maximum) {
        maxValue = maximum;
    }

    public void count() {
        if (maxValue > value) {
            value++;
        } else {
            System.out.println("Limit exceeded");
        }
    }

    public void undo() {
        if (value > 0) {
            value--;
        }
    }

    public int getValue() {
        return value;
    }
}

