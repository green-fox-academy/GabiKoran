public class ToDo implements Printable {
    private String task;
    private String priority;
    private boolean isDone;

    public ToDo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    @Override
    public void printAllFields() {
        //Task: Buy milk | Priority: high | Done: true
        System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + isDone);
    }
}
