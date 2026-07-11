package HashMap;
import java.util.Map;
import java.util.HashMap;
public class MAP1 {
    public static void main(String args[])
    {
        Map<Character, Integer> map = Map.of(
            'i' , 23,
            'v' , 45,
            'x' , 34
        );

        // map.put('l',55); ///Error

        System.out.println(map);

        Map<Character, Integer> map1 = Map.ofEntries(
            Map.entry('i' , 23),
            Map.entry('v' , 45),
            Map.entry('x' , 34)
        );

        // map1.put('l',67); /// Error

        System.out.println(map1);

        HashMap<Character, Integer> map2 = new HashMap<>(Map.of(
            'y',24,
            'z' , 25,
            'b', 1
        ));

        map2.put('a',0);    // this works

        System.out.println(map2);


    }
}
