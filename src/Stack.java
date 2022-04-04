public class Stack <T> extends List <T> {
    // add to front of queue
    public void push(T v) {
        Node temp = new Node();
        if(temp == null){
            return;
        }
        else {
            temp.value = v;
            temp.next = head;
            head = temp;
        }
    }
    // remove and return from front of queue
    public T pop() {
        if(empty()) {
            return null;
        }
        else {
            Node temp = head;
            head = head.next;
            return temp.value;
        }
    }
    // return from front of queue
    public T peek() {
        if(empty()){
            return null;
        }
        else{
            return head.value;
        }
    }
    // check if stack is empty
    @Override
    public boolean empty(){
        return super.empty();
    }
}
