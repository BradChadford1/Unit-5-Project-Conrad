public class Num implements Comparable{
    private int value;

    public Num() {
        value = 0;
    }

    public Num (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return value + "";
    }

    public boolean isEqualTo(Num num) {
        return this.value == num.getValue();
    }

    @Override
    public int compareTo(Object o) {
        Num otherNum = (Num) o;
        return this.getValue() - otherNum.getValue();
    }
}
