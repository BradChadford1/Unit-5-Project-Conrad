public class BankClient {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("savings", 10608, "US", 1500);

        savings.locked();
        savings.withdrawal(10608, 200);
        savings.unlock();
        savings.withdrawal(10608, 200);
        savings.lock();
        savings.setKey(80601);
        savings.unlock();
        savings.deposit(80601, 2100);
        savings.lock();
        savings.locked();
    }
}
