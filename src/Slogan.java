public class Slogan {
    private static int count = 0;
    private String slogan;

    public Slogan (String slogan) {
        this.slogan = slogan;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getSlogan() {
        return slogan;
    }
}
