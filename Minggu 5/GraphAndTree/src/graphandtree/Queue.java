
package graphandtree;


public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        this.maxSize = size;
        queArray = new long [maxSize];
        front = 0; rear =-1; nItems = 0;
    }
    
    public void insert(long value){
        if (rear == maxSize -1){
            rear = -1
        }
        queArray[++rear] = value;
    }
    
}
