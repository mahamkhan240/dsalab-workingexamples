import java.util.LinkedList;

public class StackInLinkedList {
    private Node top;
    public static class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public void InsertFirst(int data){
        Node n=new Node(data);
        n.next=top;
        top=n;

    }
    public Node DeleteFirst(){
        Node temp=top;
        top=top.next;
        return temp;
    }
    public void displayList(){
        Node current=top;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
class LinkedListStack{
    StackInLinkedList li=new StackInLinkedList();
    public void push(int element){
        li.InsertFirst(element);

    }
public void pop(){
        li.DeleteFirst();

}
public void displayStack(){
    System.out.println(" ");
    li.displayList();
}

}
 class LinkedListStackClient{
    public static void main(String[]args){
        LinkedListStack st=new LinkedListStack();
        st.push(55);
        st.push(88);
        st.push(33);
        System.out.println("stack after push operations");
        st.displayStack();
        System.out.println("stack after pop operations");
        st.pop();
        st.displayStack();
    }
}