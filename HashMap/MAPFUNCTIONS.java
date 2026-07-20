package HashMap;

import java.util.*;
public class MAPFUNCTIONS {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("Size : " + map.size());

        if(map.containsKey('I'))
        {
            System.out.println("True");
        }

        if(map.containsValue(10))
        {
            System.out.println("True");
        }

        System.out.println(map.get('I'));
        System.out.println("Input Key : ");
        char ch =sc.next().charAt(0);
        System.out.println(map.get(ch));
        map.remove(ch);
        System.out.println(map);

        System.out.println("Map getOrDefault() : "+ map.getOrDefault('M',0));

        sc.close();
    }
    
}
