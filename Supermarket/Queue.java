/**
 * @Aisaac23
 */
public class Queue {
    protected int maxSize;
    protected long[] queArray;
    protected int front;
    protected int rear;
    protected int nItems;
    /**
     * The is queue is an array because we want to practice how a queue works
     * this is optional since we have the Java Queue interface from java.util.
     *
     * This is a linear queue since customers make a line that is strictly one after the other.
     */

    public Queue(int s) {
        /**
         * Determines the maximum size of the queue
         */
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * Inserts an item into the front of a list
     * @param j is the item.
     */
    public void insert(long j){
        if(nItems == 0){
            queArray[0] = j;
        }else {
            queArray[++rear] = j;
            nItems++;
        }
    }
    public long remove(){
        if(nItems == 0){
            return 0;
        }
        long temp = queArray[front++];
        nItems--;
        return temp;
    }

    /**
     *
     * @return the fronts element without removing it
     */
    public long peek(){
    return queArray[front];
    }
    /**
     * Checks if there are no items left in the queue
     */
    public boolean isEmpty(){
        return nItems == 0;
    }
    /**
     * Checks if there is no space available in the queue
     */
    public boolean isFull(){
        return nItems == maxSize;
    }

    /**
     *
     * @return the number of elements in the queue
     */
    public int size(){
        return size();
    }
    public void displayQueue(){
        int disp = front;
        if(!this.isEmpty()){
            while(disp <= rear ){
                System.out.println("[" + this.queArray[disp++] + "]");
            }
        }else{
            System.out.println("Empty Queue");
            System.out.println("");
        }
    }
    public static void main(String [] args){
/**********************Testing*********************/
        System.out.println("SUPER MARKET SIMULATOR:");
        Supermarket supermarket = new Supermarket("SuperMarket_1");
        supermarket.start();//Starts main thread: the supermarket
        /**********************************************************************/
        System.out.println("\t\t\tFinishing main thread...");
    }
}
