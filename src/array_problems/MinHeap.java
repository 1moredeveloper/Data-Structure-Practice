package array_problems;

import java.util.Arrays;

public class MinHeap {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(2);
        minHeap.insert(4);
        minHeap.insert(7);
        minHeap.insert(8);
        minHeap.insert(10);
        minHeap.insert(11);
        minHeap.insert(17);
        minHeap.insert(18);
        minHeap.insert(29);
        minHeap.insert(1);

        int length = minHeap.length;
        for (int i = 0; i < length; i++) {
            System.out.print(minHeap.getMin() + ", ");
            minHeap.extractMin();
        }
    }

    private void print() {
        System.out.println(Arrays.toString(Arrays.stream(heap).limit(length).toArray()));
    }

    private int[] heap = new int[100];
    private int length = 0;

    public int getMin() {
        return heap[0];
    }


    public void extractMin() {
        heap[0] = heap[length-- - 1];
        heapify(0);
    }

    // 1. find left and right node value
    // 2. replace with lower value node
    // 3. repeat if required until leaf node
    private void heapify(int i) {
        int lowerNode;

        if (hasLeftNode(i) && hasRightNode(i)) {
            lowerNode = heap[getLeftNode(i)] < heap[getRightNode(i)] ? getLeftNode(i) : getRightNode(i);
        } else if (hasLeftNode(i)) {
            lowerNode = getLeftNode(i);
        } else if (hasRightNode(i)) {
            lowerNode = getRightNode(i);
        } else {
            return;
        }

        if (heap[i] > heap[lowerNode]) {
            swap(i, lowerNode);
            heapify(lowerNode);
        }
    }

    private boolean hasRightNode(int i) {
        return getRightNode(i) < length;
    }

    private boolean hasLeftNode(int i) {
        return getLeftNode(i) < length;
    }

    private int getRightNode(int i) {
        return 2 * i + 2;
    }

    private int getLeftNode(int i) {
        return 2 * i + 1;
    }

    public void insert(int key) {
        if (length > 0) {
            heap[length++] = key;
            insertUtil(length - 1);
        } else {
            heap[0] = key;
            length++;
        }
    }

    private void insertUtil(int i) {
        if (i == 0) return;
        int parentIndex = findParent(i);
        if (heap[i] < heap[parentIndex]) {
            swap(i, parentIndex);
            insertUtil(parentIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private int findParent(int index) {
        return index == 1 || index == 2 ? 0 : (index - 1) / 2;
    }


//                                2
//                    4                       7
//            8               10       11               17
//    18               29
}
