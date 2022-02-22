package basics.Dictonary;

import java.util.Collections;
import java.util.Dictionary;
import java.util.Map;
import java.util.TreeMap;

public class TestDictonary {
    public static void main(String[] args) {
        Map<String,Integer> dictionary = Collections.synchronizedMap(new TreeMap<String,Integer>());
    }
}
