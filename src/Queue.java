public class Queue <T> extends List <T> {
    private Node tail;

    // add to back of queue
    public void enqueue(T v){
        Node temp = new Node();
        temp.value = v;
        if(head == null){
            head = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
        }
        tail = temp;
    }
    // remove and return from front of queue
    public T dequeue(){
        if(!empty()) {
            Node temp = head;
            head = head.next;
            return temp.value;
        }
        else {
            return null;
        }
    }
    // return from front of queue
    public T peek(){
        Node temp = head;
        if(temp != null){
            return head.value;
        }
        return null;
    }
    // check if queue is empty
    @Override
    public boolean empty(){
        return super.empty();
    }

}
