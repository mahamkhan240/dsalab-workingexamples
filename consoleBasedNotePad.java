import java.io.*;
import java.util.Scanner;

class Node {
    char character;
    Node before, after;

    Node(char character) {
        this.character = character;
    }
}

class consoleBasedNotePad {

    private Node cursor;
    private Node head;

    public consoleBasedNotePad() {
        head = new Node('\n');
        cursor = head;
    }

    public void insertCharacter(char c) {
        Node newNode = new Node(c);
        if (cursor.after != null) {
            newNode.after = cursor.after;
            cursor.after.before = newNode;
        }
        cursor.after = newNode;
        newNode.before = cursor;
        cursor = newNode;
    }

    public void deleteCharacter() {
        if (cursor.before != null) {
            cursor.before.after = cursor.after;
            if (cursor.after != null) {
                cursor.after.before = cursor.before;
            }
            cursor = cursor.before;
        }
    }

    public void printText() {
        Node current = head.after;
        while (current != null) {
            System.out.print(current.character);
            current = current.after;
        }
        System.out.println();
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter("save.txt")) {
            Node currentNode = head.after;
            while (currentNode != null) {
                writer.write(currentNode.character);
                currentNode = currentNode.after;
            }
            System.out.println("Text saved to save.txt.");
        } catch (IOException e) {
            System.out.println("There was an error saving the file.");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Console-Based Notepad");

        System.out.println("commands");
        System.out.println("'b' to delete character");
        System.out.println("'s' to save text to file");
        System.out.println("'p' to print text");
        System.out.println("'q' to esc");

        while (true) {
            System.out.print("Enter command ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            } else if (input.equals("b")) {
                deleteCharacter();
            } else if (input.equals("s")) {
                saveToFile();
            } else if (input.equals("p")) {
                printText();
            } else {
                for (char c : input.toCharArray()) {
                    insertCharacter(c);
                }
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        consoleBasedNotePad notepad = new consoleBasedNotePad();
        notepad.run();
    }
}
