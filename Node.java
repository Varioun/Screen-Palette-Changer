/*  Vito Rutigliano
    10/24/20
*/
public class Node<G> {
    private G data;
    private Node next;

    public Node(G data) {
        this.data = data;
        this.next = null;
    }

    public Node(G data, Node next) {
        this.data = data;
        this.next = next;
    }

    public G getData() {
        return data;
    }

    public void setData(G data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
