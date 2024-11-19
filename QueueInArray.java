public class QueueInArray {
    int front, size , capacity;
    int array[];
    public QueueInArray(int length){
        capacity=length;
        front=size=0;
        array=new int[capacity];
    }
    boolean isFull(){
        return (size==capacity);

    }
    boolean isEmpty(){
        return (size==0);
    }
    void enqueue(int item){
        if (isFull())
            return;
        int pos;
        pos=(front+size)%capacity;
        array[pos]=item;
        size=size+1;
        System.out.println(item+"enqueued to queue");
    }
    int dequeue(){
        if (isEmpty())
            return 0;
        int item= array[front];
        front=(front+1)%capacity;
        size=size-1;
        return item;
    }
    int front(){
        if(isEmpty())
            return 0;
        return array[front];
    }
}
class Lab07{
    public static void main(String[]args){
        QueueInArray q=new QueueInArray(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(""+q.size);
        q.enqueue(77);
        System.out.println(q.dequeue()+"dequeue from queue\n");
        System.out.println("front item is"+q.front);

    }
}
