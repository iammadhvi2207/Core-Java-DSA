package HashMap;
import java.util.HashMap;
import java.util.Map;
public class CopyMap {

    public static void main(String args[])
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);

        HashMap<Character,Integer> m = new HashMap<>(Map.of(
            'L',50,
            'C',100
        ));
        map.putAll(m);
        System.out.println(map);

        // Overwriting Existing Key

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 10);
        map1.put("Banana", 20);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Banana", 50);
        map2.put("Orange", 30);

        map1.putAll(map2);

        System.out.println(map1);
    }
}
