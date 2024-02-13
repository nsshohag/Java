package queue;
public class CircularQueue {
    int queue[]=new int[10];
    int front,rear,size; 
    public void enqueue(int data){
        size++;
                if(size>queue.length)
        {
            System.out.println("OverFlow");
            return ;
        }
        queue[rear]=data;
        rear=(rear+1)%(queue.length);
    }
    public void dequeue(){
        size--;
        if(size<0)
         {
            System.out.println("UnderFlow");
            return ;
         }
        front=(front+1)%(queue.length);
    }
    public void show(){
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[(front+i)%10]+" ");
        }
        System.out.println("");   
    }  
}
