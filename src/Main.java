import list.ArrayList;
import list.ArrayListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.addAtTail("2");
        arrayList.addAtFront("1");
        arrayList.addAtFront("0");

        ArrayListIterator iterator = arrayList.getIterator();
        while(iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}