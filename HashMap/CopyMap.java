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

        HashMap<Character,Integer> map1 = new HashMap<>(Map.of(
            'L',50,
            'C',100
        ));
        map.putAll(map1);
        System.out.println(map);
    }
}
