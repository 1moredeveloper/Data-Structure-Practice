package impl_eg;

import org.jetbrains.annotations.Nullable;

public class Node {
    @Nullable
    private Node next;
    @Nullable
    private Node prev;
    private int value;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev= null;
    }

    @Nullable
    public Node getNext() {
        return next;
    }

    public void setNext(@Nullable Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public @Nullable Node getPrev() {
        return prev;
    }

    public void setPrev(@Nullable Node prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
