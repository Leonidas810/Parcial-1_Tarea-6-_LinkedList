import java.util.Collections;
import java.util.List;

public class ArrayList {
    List<String> list;
    public void addAtTail(String data){
        list.add(data);
    }

    public void addAtFront(String data){
        list.add(0,data);
    }

    public String removeIndex(int indexToRemove){
       return list.remove(indexToRemove);
    }

    public void removeAll(){
        list.removeAll(list);
    }

    public String setAt(int indexToSearch, String data){
    return list.set(indexToSearch,data);
    }

    public String getAt(int indexToSearch){
        return list.get(indexToSearch);
    }

    public boolean AllWithValue(String data){
    return list.removeAll(Collections.singleton(data));
    }

    public int getSize() {
        return list.size();
    }
    public ArrayListIterator getIterator() {
        return new ArrayListIterator(list);
    }
}
