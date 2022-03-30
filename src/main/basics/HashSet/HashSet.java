package basics.HashSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSet {
    Map map = new HashMap();
    Object o = new Object();
    public boolean add(Integer i ){
       return (map.put(i, o) == null);
    }
    public boolean remove(Integer i ){
        return (map.remove(i) != null);
    }

    public boolean contains(int i){
        return map.containsKey(i);
    }

    public Iterator<Integer> iterator(){
        return map.entrySet().iterator();
    }

    public void printAll(){
        if(map.entrySet().iterator().hasNext()){
            System.out.println(map.entrySet().iterator().next());
        }
    }
}
