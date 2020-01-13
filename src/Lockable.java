public interface Lockable {
    void setKey(int key);
    void lock();
    void unlock();
    boolean locked();
}
