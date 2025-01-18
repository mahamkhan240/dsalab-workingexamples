

import java.util.Scanner;

class singleNode {

    String task;

    singleNode next;

    singleNode(String task) {

        this.task = task;

        this.next = null;

    }

}

class SinglyLinkedListToDo {

    private singleNode head;

    public void addTask(String task) {

        singleNode newNode = new singleNode(task);

        if (head == null) {

            head = newNode;

        } else {

            singleNode temp = head;

            while (temp.next != null) {

                temp = temp.next;

            }

            temp.next = newNode;

        }

        System.out.println("Task added: " + task);

    }

    public void deleteFirstTask() {

        if (head == null) {

            System.out.println("No tasks to delete.");

        } else {

            System.out.println("Completed and removed task: " + head.task);

            head = head.next;

        }

    }

    public void displayTasks() {

        if (head == null) {

            System.out.println("To-Do List is empty.");

            return;

        }

        System.out.println("To-Do List:");

        singleNode temp = head;

        while (temp != null) {

            System.out.println("- " + temp.task);

            temp = temp.next;

        }

    }

}
class ToDoListSingleLinked {

    public static void main(String[] args) {

        SinglyLinkedListToDo toDoList = new SinglyLinkedListToDo();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nOptions: 1. Add Task 2. Complete Task 3. Display Tasks 4. Exit");

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


