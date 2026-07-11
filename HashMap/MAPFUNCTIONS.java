package HashMap;

import java.util.HashMap;
import java.util.*;
public class MAPFUNCTIONS {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);

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
        sc.close();
    }
    
}
