package HashMap;
import java.util.*;
import java.util.HashMap;
class Sample1
{
    public static void main(String args[])
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);

        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}