
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    int priority;

    Task(int taskId, String taskName, int priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
    }

    void display() {
        String level;

        if (priority == 1)
            level = "High";
        else if (priority == 2)
            level = "Medium";
        else
            level = "Low";

        System.out.println(
            "Task ID: " + taskId +
            ", Task Name: " + taskName +
            ", Priority: " + level
        );
    }
}

public class PQ_CPUTaskScheduler {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Task> tasks =
            new PriorityQueue<>(
                Comparator.comparingInt(t -> t.priority)
            );

        int choice;

        do {
            System.out.println("\n--- CPU Task Scheduler ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Next Task");
            System.out.println("3. Execute Task");
            System.out.println("4. Display Pending Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();

                    System.out.println(
                        "Priority: 1-High, 2-Medium, 3-Low"
                    );
                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();

                    if (priority < 1 || priority > 3) {
                        System.out.println("Invalid priority!");
                        break;
                    }

                    tasks.offer(new Task(id, name, priority));
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    Task next = tasks.peek();

                    if (next == null) {
                        System.out.println("No pending tasks.");
                    } else {
                        System.out.println("Next task to execute:");
                        next.display();
                    }
                    break;

                case 3:
                    Task executed = tasks.poll();

                    if (executed == null) {
                        System.out.println("No tasks to execute.");
                    } else {
                        System.out.println("Executing task:");
                        executed.display();
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No pending tasks.");
                    } else {
                        PriorityQueue<Task> temp =
                            new PriorityQueue<>(tasks);

                        System.out.println("\nPending Tasks:");

                        while (!temp.isEmpty()) {
                            temp.poll().display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Scheduler stopped.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
