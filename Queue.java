/*  Vito Rutigliano
    10/24/20
*/
public class Queue<N> {
    private Node<N> head = null;
    private Node<N> tail = null;

    public void enQueue(N data) {
        Node<N> node = new Node<>(data);
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public N deQueue () {
        N data = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public N peek() {
        return head.getData();
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        Node curr = head;
        int total = 0;
        while (curr != null) {
            total++;
            curr = curr.getNext();
        }
        return total;
    }

    public boolean isFull() {
        return (size() >= 5);
    }

    public void clear() {
        tail = null;
        head = null;
    }
    
    public N getTail() {
        return tail.getData(); // quick change for lab
    }
}
