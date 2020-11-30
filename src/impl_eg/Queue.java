package impl_eg;

public class Queue {
    private int length;
    private Node front;
    private Node rear;

    public Queue() {
        this.length = 0;
        this.front = null;
        this.rear = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            this.front = newNode;
        } else {
            this.rear.setNext(newNode);
        }
        this.rear = newNode;
        length++;
    }

    private boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return front.getValue();
    }

    public void remove() {
        this.front = this.front.getNext();
        length--;
    }

    public void display() {
        // check for stack underflow
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node temp = front;
            while (temp != null) {

                // print node data
                System.out.printf("%d ", temp.getValue());

                // assign temp link to temp
                temp = temp.getNext();
            }
        }
    }
}
