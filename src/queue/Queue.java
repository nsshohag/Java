package queue;
public class Queue {
    int queue[]=new int[100];
    int size;
    int front;
    int rear;
    public void enqueue(int data){
      size++;
      if(size>queue.length)
      {
          System.out.println("OverFlow");
          return ;
      }
      queue[rear]=data;
      rear++;
    }
    public void dequeue(){
        size--;
        if(size<0)
        {
            System.out.println("UnderFlow");
            return ;
        }
        front++;
    }
    public void show(){
        for(int i=0;i<size;i++)
        { 
            System.out.print(queue[front+i]+" ");
        }
        System.out.println("");
        
    }
    
}
