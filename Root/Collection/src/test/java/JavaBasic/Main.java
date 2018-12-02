import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main
{
    public static void main(String[] args) {

       String[] str=new String[]{"1","2","a","b","11","21","aa","bb"};
       ConcurrentHashMap<String,Object> map=new ConcurrentHashMap<>();
       Hashtable<String,Object> hashtable=new Hashtable<>();
        for (String i:str) {
            map.put(i,new String("value"));
            hashtable.put(i,new String("value"));
        }


    }
}
