class CircularLinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        if (position == 0) {
            if (head.next == head) {
                head = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        Node prev = null;
        for (int i = 0; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }

        if (temp.next == head) {
            prev.next = head;
        } else {
            prev.next = temp.next;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.append(7);
        cl.append(9);
        cl.append(4);
        cl.append(8);
        cl.append(10);

        System.out.println("Original List before deletion");
        cl.displayList();

        cl.deleteNodeAtPosition(2);

        System.out.println("List after deletion:");
        cl.displayList();
    }
}
