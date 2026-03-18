import java.util.*;

public class LinkedHashMapAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        // LinkedHashMap() → creates empty map with insertion order

        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>(20);
        // LinkedHashMap(int capacity) → initial capacity

        LinkedHashMap<Integer,String> map3 = new LinkedHashMap<>(20,0.75f);
        // LinkedHashMap(int capacity, float loadFactor)

        LinkedHashMap<Integer,String> map4 =
                new LinkedHashMap<>(20,0.75f,true);
        // LinkedHashMap(int capacity,float loadFactor,boolean accessOrder)
        // accessOrder=true → maintains order based on access

        LinkedHashMap<Integer,String> map5 =
                new LinkedHashMap<>(Map.of(1,"A",2,"B"));
        // LinkedHashMap(Map m) → creates map from another map



        // =====================================================
        // PUT METHODS
        // =====================================================

        map.put(1,"Ajay");
        // put(K,V) → inserts key-value pair

        map.put(2,"Rahul");

        map.putIfAbsent(3,"Rohit");
        // putIfAbsent(K,V) → inserts only if key not present

        map.putAll(map5);
        // putAll(Map) → inserts all entries from another map

        System.out.println("After insertion: " + map);



        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(map.get(1));
        // get(key) → returns value for given key

        System.out.println(map.getOrDefault(10,"Not Found"));
        // getOrDefault(key,default) → returns default value if key absent

        System.out.println(map.containsKey(2));
        // containsKey(key) → checks if key exists

        System.out.println(map.containsValue("Ajay"));
        // containsValue(value) → checks if value exists

        System.out.println(map.size());
        // size() → number of entries

        System.out.println(map.isEmpty());
        // isEmpty() → checks if map empty



        // =====================================================
        // REMOVE METHODS
        // =====================================================

        map.remove(2);
        // remove(key) → removes entry by key

        map.remove(1,"Ajay");
        // remove(key,value) → removes entry only if key and value match



        // =====================================================
        // REPLACE METHODS
        // =====================================================

        map.put(4,"Kiran");

        map.replace(4,"Vijay");
        // replace(key,value) → replaces value for key

        map.replace(4,"Vijay","Suresh");
        // replace(key,oldValue,newValue) → replaces if old value matches

        map.replaceAll((k,v)->v.toUpperCase());
        // replaceAll(BiFunction) → updates all values



        // =====================================================
        // COMPUTE METHODS (Java 8)
        // =====================================================

        map.compute(3,(k,v)->v+" Kumar");
        // compute(key,function) → recalculates value

        map.computeIfAbsent(5,k->"NewUser");
        // computeIfAbsent → adds entry if key absent

        map.computeIfPresent(3,(k,v)->v+" Updated");
        // computeIfPresent → updates entry only if key exists

        map.merge(3," Merged",(oldVal,newVal)->oldVal+newVal);
        // merge(key,value,function) → merges values



        // =====================================================
        // VIEW METHODS
        // =====================================================

        Set<Integer> keys = map.keySet();
        // keySet() → returns set view of keys

        Collection<String> values = map.values();
        // values() → returns collection view of values

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        // entrySet() → returns set of key-value pairs



        // =====================================================
        // ITERATION METHODS
        // =====================================================

        for(Integer k : map.keySet())
            System.out.println("Key: "+k);

        for(String v : map.values())
            System.out.println("Value: "+v);

        for(Map.Entry<Integer,String> e : map.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());

        map.forEach((k,v)->System.out.println(k+" = "+v));
        // forEach(BiConsumer) → performs action on each entry



        // =====================================================
        // CLEAR METHOD
        // =====================================================

        map.clear();
        // clear() → removes all entries



        // =====================================================
        // OBJECT CLASS METHODS
        // =====================================================

        System.out.println(map.hashCode());
        // hashCode() → returns hash code of map

        System.out.println(map.equals(map2));
        // equals(Object) → compares maps

        System.out.println(map.toString());
        // toString() → returns string representation
    }
}