public class NumClient {
    public static void main(String[] args) {
        Num num1 = new Num(12);
        Num num2 = new Num(24);
        Num num3 = new Num();

        System.out.println(num1.getValue() + " and " + num2.getValue());
        System.out.println(num1.isEqualTo(num2));
        num2.setValue(12);
        System.out.println(num1.getValue() + " and " + num2.getValue());
        System.out.println(num1.isEqualTo(num2));
        System.out.println(num3.getValue());
    }
}
