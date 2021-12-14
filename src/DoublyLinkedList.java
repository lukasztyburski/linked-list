public class DoublyLinkedList<E> {

    private Node<E> head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    // insert value at back
    public void pushBack(E data) {
        if (isEmpty()) {
            head = new Node<>(data, null, null);

        } else {
            Node<E> lastNode = head;
            lastNode = findLastNode(lastNode);
            createNewNodeAndSetupPreviousOne(data, lastNode);
        }
        size++;
    }

    private void createNewNodeAndSetupPreviousOne(E data, Node<E> lastNode) {
        Node<E> newNode = new Node<>(data, null, lastNode);
        lastNode.setNext(newNode);
        newNode.setPrev(lastNode);
    }

    private Node<E> findLastNode(Node<E> lastNode) {
        while (lastNode.hasNext()) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

    // remove value at back and return it
    public E popBack() throws EmptyListException {
        if (!isEmpty()) {
            Node<E> result;
            Node<E> lastNode = head;
            lastNode = findLastNode(lastNode);
            result = lastNode;

            clearUpLastNode(lastNode);

            size--;
            return result.getData();
        } else {
            throw new EmptyListException("There is no elements in the list.");
        }

    }

    private void clearUpLastNode(Node<E> lastNode) {
        if (lastNode.hasPrev()) {
            lastNode.getPrev().setNext(null);
        } else {
            head = null;
        }
    }

    // remove value at front and return it
    public E popFront() throws EmptyListException {
        if (!isEmpty()) {
            Node<E> result = head;
            head = result.getNext();
            size--;
            return result.getData();
        } else {
            throw new EmptyListException("There is no elements in the list.");
        }
    }

    // insert value at front
    public void pushFront(E data) {
        if (isEmpty()) {
            head = new Node<>(data, null, null);
        } else {
            Node<E> newNode = new Node<>(data, head, null);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    private boolean isEmpty() {
        return head == null;
    }

}
