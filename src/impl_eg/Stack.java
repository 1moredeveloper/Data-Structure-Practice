package impl_eg;

public class Stack {
    private Node top;
    private int length;

    public Stack() {
        top = null;
        length = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (!isEmpty()) {
            newNode.setNext(top);
        }
        top = newNode;
        length++;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            Node temp = top;
            top = temp.getNext();
            length--;
            return temp.getValue();
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top.getValue();
    }

    public int length() {
        return length;
    }

    public void display() {
        // check for stack underflow
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d ", temp.getValue());

                // assign temp link to temp
                temp = temp.getNext();
            }
        }
    }
}
