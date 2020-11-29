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

    public void insert(Node node, int position) {
        if (position == 0) {
            node.setNext(getHead());
            setHead(node);
            incrementLength();
        } else {
            Node beforeNode = node(position - 1);
            if (beforeNode != null) {
                node.setNext(beforeNode.getNext());
                beforeNode.setNext(node);
                incrementLength();
            }
        }
    }

    public void append(Node node) {
        if (getHead() == null) {
            setHead(node);
            incrementLength();
            return;
        }

        node(length() - 1).setNext(node);
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
    public Node node(int position) {
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
}
