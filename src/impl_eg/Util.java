package impl_eg;

public class Util {
    public static void main(String[] args) {
//        testSinglyLinkedList();
        testStack();
    }

    private static void testStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.peek());
        printStack(stack);
    }

    private static void printStack(Stack stack) {
        stack.display();
    }

    private static void testSinglyLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(5);
        linkedList.insert(4, 3);
        linkedList.remove(4);
        linkedList.remove(1);

//        System.out.println(linkedList.get(4));
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
