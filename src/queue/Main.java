package queue;
public class Main {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.show();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.show();
        
        CircularQueue c=new CircularQueue();
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);
        c.enqueue(6);
        c.enqueue(7);
        c.enqueue(8);
        c.enqueue(9);
        c.enqueue(10);
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.show();
        
    }
}
