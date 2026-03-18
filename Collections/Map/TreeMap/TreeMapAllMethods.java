import java.util.*;

public class TreeMapAllMethods {

    public static void main(String[] args) {

        // =====================================================
        // CONSTRUCTORS
        // =====================================================

        TreeMap<Integer,String> map = new TreeMap<>();
        // TreeMap() → creates empty TreeMap sorted by natural order of keys

        TreeMap<Integer,String> map2 = new TreeMap<>(Collections.reverseOrder());
        // TreeMap(Comparator) → creates TreeMap with custom comparator

        TreeMap<Integer,String> map3 = new TreeMap<>(Map.of(1,"A",2,"B"));
        // TreeMap(Map m) → creates TreeMap and sorts keys

        TreeMap<Integer,String> map4 = new TreeMap<>(map);
        // TreeMap(SortedMap m) → creates TreeMap from another sorted map



        // =====================================================
        // PUT METHODS
        // =====================================================

        map.put(3,"C");
        // put(K,V) → inserts key-value pair

        map.put(1,"A");

        map.put(2,"B");

        map.putIfAbsent(4,"D");
        // putIfAbsent(K,V) → inserts only if key absent

        map.putAll(map3);
        // putAll(Map) → inserts all entries from another map

        System.out.println("After insertion: "+map);



        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println(map.get(1));
        // get(key) → returns value associated with key

        System.out.println(map.getOrDefault(10,"Not Found"));
        // getOrDefault(key,defaultValue)

        System.out.println(map.containsKey(2));
        // containsKey(key) → checks if key exists

        System.out.println(map.containsValue("A"));
        // containsValue(value)

        System.out.println(map.size());
        // size() → number of entries

        System.out.println(map.isEmpty());
        // isEmpty() → checks if map empty



        // =====================================================
        // REMOVE METHODS
        // =====================================================

        map.remove(4);
        // remove(key) → removes entry

        map.remove(1,"A");
        // remove(key,value) → removes only if key & value match



        // =====================================================
        // REPLACE METHODS
        // =====================================================

        map.replace(2,"BB");
        // replace(key,value) → replaces value

        map.replace(2,"BB","B");
        // replace(key,old,new)

        map.replaceAll((k,v)->v.toLowerCase());
        // replaceAll(BiFunction) → modifies all values



        // =====================================================
        // COMPUTE METHODS (Java 8)
        // =====================================================

        map.compute(3,(k,v)->v+" updated");
        // compute(key,function) → recomputes value

        map.computeIfAbsent(5,k->"E");
        // computeIfAbsent → inserts if key absent

        map.computeIfPresent(3,(k,v)->v+" again");
        // computeIfPresent → updates if key exists

        map.merge(3," merged",(oldVal,newVal)->oldVal+newVal);
        // merge(key,value,function)



        // =====================================================
        // SORTEDMAP METHODS
        // =====================================================

        System.out.println(map.firstKey());
        // firstKey() → smallest key

        System.out.println(map.lastKey());
        // lastKey() → largest key

        System.out.println(map.headMap(3));
        // headMap(key) → returns portion less than key

        System.out.println(map.tailMap(2));
        // tailMap(key) → returns portion greater/equal to key

        System.out.println(map.subMap(2,5));
        // subMap(fromKey,toKey)



        // =====================================================
        // NAVIGABLEMAP METHODS
        // =====================================================

        System.out.println(map.ceilingKey(2));
        // ceilingKey(key) → smallest key ≥ given key

        System.out.println(map.floorKey(2));
        // floorKey(key) → greatest key ≤ given key

        System.out.println(map.higherKey(2));
        // higherKey(key) → smallest key strictly greater

        System.out.println(map.lowerKey(2));
        // lowerKey(key) → greatest key strictly smaller

        System.out.println(map.firstEntry());
        // firstEntry() → first key-value pair

        System.out.println(map.lastEntry());
        // lastEntry() → last key-value pair

        System.out.println(map.pollFirstEntry());
        // pollFirstEntry() → removes first entry

        System.out.println(map.pollLastEntry());
        // pollLastEntry() → removes last entry



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
        // forEach(BiConsumer)



        // =====================================================
        // NAVIGATION VIEWS
        // =====================================================

        System.out.println(map.descendingMap());
        // descendingMap() → reverse order view

        System.out.println(map.navigableKeySet());
        // navigableKeySet() → sorted key set

        System.out.println(map.descendingKeySet());
        // descendingKeySet()



        // =====================================================
        // CLEAR METHOD
        // =====================================================

        map.clear();
        // clear() → removes all entries



        // =====================================================
        // OBJECT METHODS
        // =====================================================

        System.out.println(map.hashCode());
        // hashCode()

        System.out.println(map.equals(map2));
        // equals(Object)

        System.out.println(map.toString());
        // toString()
    }
}