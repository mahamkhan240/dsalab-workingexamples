import java.io.*;
import java.util.Scanner;

public class ConsoleNotepad {

    // Node class for a doubly linked list
    static class Node {
        char data;
        Node before, after, above, below;

        public Node(char data) {
            this.data = data;
            this.before = this.after = this.above = this.below = null;
        }
    }

    // Text editor class with all functionalities
    static class TextEditor {
        private Node cursor;
        private Node head;
        private Node currentLineStart;
        private int numRows, numCols;

        // Constructor initializing the editor
        public TextEditor() {
            this.head = new Node('\n');
            this.cursor = head;
            this.currentLineStart = head;
            this.numRows = 1;
            this.numCols = 1;
            loadFile(); // Load text from the file when starting
        }

        // Load text from the save.txt file
        private void loadFile() {
            try (BufferedReader br = new BufferedReader(new FileReader("save.txt"))) {
                String line;
                Node currentLine = head;
                while ((line = br.readLine()) != null) {
                    for (char c : line.toCharArray()) {
                        addCharacter(c);
                    }
                    addCharacter('\n');  // End of line
                }
            } catch (IOException e) {
                System.out.println("Error loading file.");
            }
        }

        // Save text to the save.txt file
        private void saveFile() {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"))) {
                Node temp = head;
                while (temp != null) {
                    if (temp.data != '\n') {
                        bw.write(temp.data);
                    } else {
                        bw.newLine();
                    }
                    temp = temp.after;
                }
            } catch (IOException e) {
                System.out.println("Error saving file.");
            }
        }

        // Add character at the cursor
        private void addCharacter(char c) {
            Node newNode = new Node(c);

            if (cursor.after != null) {
                cursor.after.before = newNode;
                newNode.after = cursor.after;
            }

            cursor.after = newNode;
            newNode.before = cursor;

            // Move the cursor to the next character
            cursor = newNode;
        }

        // Move cursor to the next character
        private void moveCursorRight() {
            if (cursor.after != null) {
                cursor = cursor.after;
            }
        }

        // Move cursor to the previous character
        private void moveCursorLeft() {
            if (cursor.before != null) {
                cursor = cursor.before;
            }
        }

        // Move cursor to the next line
        private void moveCursorDown() {
            if (cursor.below != null) {
                cursor = cursor.below;
            }
        }

        // Move cursor to the previous line
        private void moveCursorUp() {
            if (cursor.above != null) {
                cursor = cursor.above;
            }
        }

        // Delete character at the cursor
        private void deleteCharacter() {
            if (cursor.before != null) {
                Node temp = cursor;
                cursor = cursor.before;
                cursor.after = temp.after;
                if (temp.after != null) {
                    temp.after.before = cursor;
                }
            }
        }

        // Handle key press and perform respective actions
        public void handleKeyPress(char key) {
            if (key == '\u001B') {  // Escape key
                saveFile();
                System.exit(0);
            } else if (key == '\u0008') {  // Backspace
                deleteCharacter();
            } else if (key == '\u0003') {  // Ctrl+S (Save)
                saveFile();
            } else if (key == '\u000C') {  // Ctrl+L (Load)
                loadFile();
            } else {
                addCharacter(key);
            }
        }

        // Display the text with cursor
        public void displayText() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.after;
            }
            System.out.println("\nCursor at: " + cursor.data);
        }

        // Show instructions to the user
        public void showInstructions() {
            System.out.println("Console Notepad - Commands:");
            System.out.println("  Type characters to input text.");
            System.out.println("  Backspace to delete.");
            System.out.println("  Ctrl + S to save.");
            System.out.println("  Ctrl + L to load.");
            System.out.println("  Press 'Esc' to exit and save.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        // Show initial instructions
        editor.showInstructions();

        while (true) {
            editor.displayText();

            // Wait for user input and handle it
            char input = sc.next().charAt(0);
            editor.handleKeyPress(input);
        }
    }
}
