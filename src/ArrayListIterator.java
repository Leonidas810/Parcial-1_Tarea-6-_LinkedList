import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {
    public ArrayListIterator(List<String> list) {
        Iterator <String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            }
        }
    }
