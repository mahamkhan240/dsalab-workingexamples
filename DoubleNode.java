import java.util.Scanner;
class DoubleNode {

    String task;

    DoubleNode next;

    DoubleNode prev;

    DoubleNode(String task) {

        this.task = task;

        this.next = null;

        this.prev = null;

    }

}

class DoublyLinkedListToDo {

    private DoubleNode head;

    public void addTask(String task) {

        DoubleNode newNode = new DoubleNode(task);

        if (head == null) {

            head = newNode;

        } else {

            DoubleNode temp = head;

            while (temp.next != null) {

                temp = temp.next;

            }

            temp.next = newNode;

            newNode.prev = temp;

        }

        System.out.println("Task added: " + task);

    }

    public void deleteFirstTask() {

        if (head == null) {

            System.out.println("No tasks available to delete.");

        } else {

            System.out.println("Completed and removed 1 task: " + head.task);

            head = head.next;

            if (head != null) {

                head.prev = null;

            }

        }

    }

    public void displayTasks() {

        if (head == null) {

            System.out.println("To-Do List is empty.");

            return;

        }

        System.out.println("To-Do List:");

        DoubleNode temp = head;

        while (temp != null) {

            System.out.println("- " + temp.task);

            temp = temp.next;

        }

    }

}

 class ToDoListDoubleLinked {

    public static void main(String[] args) {

        DoublyLinkedListToDo toDoList = new DoublyLinkedListToDo();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nOptions: 1. Add Task \n2. Complete Task \n3. Display Tasks \n4. Exit");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter task description: ");

                    String task = scanner.nextLine();

                    toDoList.addTask(task);

                    break;

                case 2:

                    toDoList.deleteFirstTask();

                    break;

                case 3:

                    toDoList.displayTasks();

                    break;

                case 4:

                    System.out.println("Exiting...");

                    scanner.close();

                    return;

                default:

                    System.out.println("Invalid option. Try again.");

            }

        }

    }

}

