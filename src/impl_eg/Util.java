package impl_eg;

public class Util {
    public static void main(String[] args) {
        testSinglyLinkedList();
    }

    private static void testSinglyLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(new Node(1));
        linkedList.append(new Node(2));
        linkedList.append(new Node(3));
        linkedList.append(new Node(5));
        linkedList.insert(new Node(4), 3);
        linkedList.remove(4);
        linkedList.remove(1);

        System.out.println(linkedList.get(4));
        System.out.println(linkedList.length());
        printList(linkedList);
    }

    private static void printList(LinkedList linkedList) {
        if (linkedList.getHead() != null) {
            Node currentNode = linkedList.getHead();
            while (currentNode.getNext() != null) {
                System.out.print(currentNode.getValue() + " ");
                currentNode = currentNode.getNext();
            }
            System.out.println(currentNode.getValue() + " ");
        } else {
            System.out.println("List don't have head");
        }
    }
}
