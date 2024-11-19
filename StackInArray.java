public class StackInArray {
    private int arr[];
    private int size;
    private int index = 0;

    public StackInArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        arr[index]=element;
        index++;
    }
    public int pop (){
        if(isEmpty()){
            System.out.println("Stack is empty");

        }
        return arr[--index];
    }
    public boolean isEmpty(){
        if(index==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(index==size){
            return true;
        }
        return false;
    }
    public int size(){
        return index;
    }
}
class StackClient{
    public static void main(String[]args){
        StackInArray stack=new StackInArray(5);
        stack.push(8);
        stack.push(22);
        stack.push(11);
        stack.push(33);
        stack.push(44);
        System.out.println("Size of stack after push operations"+stack.size());
        System.out.println("pop elements from the stack:");
        while(!stack.isEmpty()){
            System.out.println(+stack.pop());
        }
        System.out.println("size of stack after pop operations:"+stack.size());


    }

}
