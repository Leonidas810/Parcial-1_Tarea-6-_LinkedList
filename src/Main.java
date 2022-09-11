public class Main {
    public  static void main(String[] args){

        LinkedList list = new LinkedList();
        list.addAtTail(String.valueOf(10));
        list.addAtFront(String.valueOf(20));

        System.out.println("Size: "+list.getSize());

        list.removeAll();
        System.out.println("Size: "+list.getSize());


    }
}
