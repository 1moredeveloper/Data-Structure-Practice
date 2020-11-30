package impl_eg;

import org.jetbrains.annotations.Nullable;

public class LinkedList {
    @Nullable
    private Node head;
    private int length = 0;

    public LinkedList() {
    }

    public LinkedList(@Nullable Node head) {
        this.head = head;
        incrementLength();
    }

    private void incrementLength() {
        length++;
    }

    @Nullable
    public Node getHead() {
        return head;
    }

    private void setHead(@Nullable Node head) {
        this.head = head;
    }

    public int length() {
        return length;
    }

    public void insert(int value, int position) {
        if (position == 0) {
            Node node = new Node(value);
            node.setNext(getHead());
            setHead(node);
            incrementLength();
        } else {
            Node beforeNode = node(position - 1);
            if (beforeNode != null) {
                Node node = new Node(value);
                node.setNext(beforeNode.getNext());
                beforeNode.setNext(node);
                incrementLength();
            }
        }
    }

    public void append(int value) {
        if (getHead() == null) {
            Node node = new Node(value);
            setHead(node);
            incrementLength();
            return;
        }

        node(length() - 1).setNext(new Node(value));
        incrementLength();
    }

    public void remove(int position) {
        if (position == 0) {
            if (getHead() != null) {
                setHead(getHead().getNext());
                decrementLength();
            }
        } else {
            Node beforeNode = node(position - 1);
            if (beforeNode != null) {
                beforeNode.setNext(beforeNode.getNext().getNext());
                decrementLength();
            }
        }
    }

    private void decrementLength() {
        length--;
    }

    public int get(int position) {
        return node(position).getValue();
    }

    @Nullable
    private Node node(int position) {
        int i = 0;
        Node currNode = getHead();
        while (currNode != null) {
            if (i == position) {
                return currNode;
            }
            currNode = currNode.getNext();
            i++;
        }
        return null;
    }

    public void removeLast() {
        Node node = node(length - 2);
        node.setNext(null);
    }

    public int getLast() {
        return get(length - 1);
    }
}
