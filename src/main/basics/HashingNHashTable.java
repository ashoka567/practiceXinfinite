package basics;

import java.util.HashMap;
import java.util.Map;

public class HashingNHashTable {

    public static void main(String [] args){
        Map<String, String> m = new HashMap<>();

        m.put("As","b");
        m.put("gaa","v");
        m.put("esa","f");

        m.get("As");
        m.get("gaa");
        m.get("esa");
    }
}
