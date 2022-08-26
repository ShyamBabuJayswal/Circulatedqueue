// Array is best for circular queue because all oparation done in o(1)
//push     o(1)                   rear+1=front full queue
//pop   o(1)                      rear=(rear+1)%size
//peek o(1)                       (rear+1)%size==front full queue
public class usingArray {
    static class queue{

        static int []arr;
        static  int size;
        static int rear=-1;
        static int front=-1;
        queue(int n){
            arr=new int[n];
            this.size=n;
        }
        //check circular queue is full or empty
    public static boolean full(){
        return (rear+1)%size==front;
    }
    public static boolean isEmpty(){
            return rear==-1 && front==-1;
    }
    //enqueue
        public static void add(int data){
            if(full()){
                System.out.println("full queue");
                return;
            }
            if(front==-1){
                front =0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
          int result=arr[front];
            //single element
            if(rear==front){
                return  front=-1;
            }
            else{
                front=(front+1)%size;
                return front;
            }
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }

    }


}
