public class Task implements Priority {
    private String name;
    private int priority;
    private boolean isComplete;

    public Task (String name, int priority) {
        this.name = name;
        this.priority = priority;
        isComplete = false;
    }

    @Override
    public void setPriority(int priorityLevel) {
        this.priority = priorityLevel;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public String toString() {
        return "Task: " + name + "\nPriority: " + this.getPriority();
    }

    public void doTask() {
        System.out.println("Doing task... Working...");
        isComplete = true;
        this.setPriority(0);
        System.out.println("Task complete");
    }
}
