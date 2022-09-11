public class LinkedListIterator {
    private Node node;

    public LinkedListIterator(Node head) {
        this.node=head;
    }
    public boolean hasNext(){
        return node != null;
    }
    public String next(){
        String Name = node.getData();
        node=node.getNext();
        return Name;
    }
}
