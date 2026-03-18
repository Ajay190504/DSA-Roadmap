import java.util.*;

public class HashMapAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        HashMap<Integer,String> map = new HashMap<>();
        // HashMap() → creates empty HashMap with default capacity (16)

        HashMap<Integer,String> map2 = new HashMap<>(20);
        // HashMap(int capacity) → creates map with given initial capacity

        HashMap<Integer,String> map3 = new HashMap<>(20,0.75f);
        // HashMap(int capacity, float loadFactor)

        HashMap<Integer,String> map4 = new HashMap<>(Map.of(1,"A",2,"B"));
        // HashMap(Map m) → creates map from another map


        // =====================================================
        // PUT METHODS
        // =====================================================

        map.put(1,"Ajay");
        // put(K,V) → inserts key-value pair

        map.put(2,"Rahul");

        map.putIfAbsent(3,"Rohit");
        // putIfAbsent(K,V) → inserts only if key not already present

        map.putAll(map4);
        // putAll(Map) → inserts all mappings from another map

        System.out.println("Map after insertion: " + map);


        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(map.get(1));
        // get(Object key) → returns value for given key

        System.out.println(map.getOrDefault(10,"Not Found"));
        // getOrDefault(key, default) → returns default if key absent

        System.out.println(map.containsKey(2));
        // containsKey(key) → checks if key exists

        System.out.println(map.containsValue("Ajay"));
        // containsValue(value) → checks if value exists

        System.out.println(map.size());
        // size() → number of entries

        System.out.println(map.isEmpty());
        // isEmpty() → checks if map is empty


        // =====================================================
        // REMOVE METHODS
        // =====================================================

        map.remove(2);
        // remove(key) → removes entry by key

        map.remove(1,"Ajay");
        // remove(key,value) → removes only if both match


        // =====================================================
        // REPLACE METHODS
        // =====================================================

        map.put(4,"Kiran");

        map.replace(4,"Vijay");
        // replace(key,value) → replaces value

        map.replace(4,"Vijay","Suresh");
        // replace(key,old,new) → replaces only if old value matches

        map.replaceAll((k,v) -> v.toUpperCase());
        // replaceAll(BiFunction) → updates all values


        // =====================================================
        // COMPUTE METHODS (Java 8)
        // =====================================================

        map.compute(3,(k,v)-> v+" Kumar");
        // compute(key,function) → recalculates value

        map.computeIfAbsent(5,k->"NewUser");
        // computeIfAbsent → adds if key missing

        map.computeIfPresent(3,(k,v)->v+" Updated");
        // computeIfPresent → updates only if key exists

        map.merge(3," Merged",(oldVal,newVal)->oldVal+newVal);
        // merge(key,value,function) → combines values


        // =====================================================
        // VIEW METHODS
        // =====================================================

        Set<Integer> keys = map.keySet();
        // keySet() → returns set of keys

        Collection<String> values = map.values();
        // values() → returns collection of values

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        // entrySet() → returns set of key-value pairs


        // =====================================================
        // ITERATION METHODS
        // =====================================================

        for(Integer k : map.keySet())
            System.out.println(k);

        for(String v : map.values())
            System.out.println(v);

        for(Map.Entry<Integer,String> e : map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());

        map.forEach((k,v)->System.out.println(k+" -> "+v));
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
        // hashCode() → returns hash code

        System.out.println(map.equals(map2));
        // equals(Object) → compares two maps

        System.out.println(map.toString());
        // toString() → string representation
    }
}