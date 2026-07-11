package HashMap;

import java.util.Map;

public class COMPARISON {
    public static void main(String args[])
    {
        Map<Character, Integer> map = Map.of(
            'i' , 23,
            'v' , 45,
            'x' , 34
        );

        Map<Character, Integer> map1 = Map.ofEntries(
            Map.entry('i' , 23),
            Map.entry('v' , 45),
            Map.entry('x' , 34)
        );

        System.out.println(map.equals(map1));

        System.out.println(map.hashCode());
        
        String s = map.toString();

        System.out.println(s);
        System.out.println(s.charAt(5));
    }
}
