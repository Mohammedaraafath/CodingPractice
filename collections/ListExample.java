package collections;
// -------------------- Java Collections Example with Explanation --------------------

/*
LIST vs LINKEDLIST
------------------------------------------------------------------------------------------
| Feature        | ArrayList                         | LinkedList                        |
|----------------|------------------------------------|-----------------------------------|
| Order          | Maintains insertion order         | Maintains insertion order         |
| Duplicates     | Allows duplicates                 | Allows duplicates                 |
| Null Values    | Multiple null values allowed      | Multiple null values allowed      |
| Random Access  | Fast (uses index)                 | Slow (traverses nodes)            |
| Insert/Delete  | Slower (shift elements)           | Faster (start/middle)             |
| Memory Usage   | Less memory                       | More memory (pointers)            |
------------------------------------------------------------------------------------------

HASHMAP vs LINKEDHASHMAP vs TREEMAP
------------------------------------------------------------------------------------------
| Feature     | HashMap                    | LinkedHashMap              | TreeMap                     |
|-------------|----------------------------|----------------------------|-----------------------------|
| Order       | No order                   | Maintains insertion order  | Sorted by keys              |
| Duplicates  | No duplicate keys          | No duplicate keys          | No duplicate keys           |
| Null Keys   | One null key allowed       | One null key allowed       | No null keys allowed        |
| Null Values | Multiple null values       | Multiple null values       | Multiple null values        |
| Performance | Fast                       | Slightly slower            | Slow (uses sorting)         |
------------------------------------------------------------------------------------------

HASHSET vs LINKEDHASHSET vs TREESET
------------------------------------------------------------------------------------------
| Feature     | HashSet                    | LinkedHashSet              | TreeSet                     |
|-------------|----------------------------|----------------------------|-----------------------------|
| Order       | No order                   | Maintains insertion order  | Sorted order                |
| Duplicates  | No duplicates              | No duplicates              | No duplicates               |
| Null Values | One null allowed           | One null allowed           | No null allowed             |
| Performance | Fast                       | Slightly slower            | Slow (due to sorting)       |
------------------------------------------------------------------------------------------

LIST vs MAP vs SET (Collection Type Overview)
------------------------------------------------------------------------------------------
| Feature         | List                              | Map                               | Set                            |
|-----------------|-----------------------------------|-----------------------------------|-------------------------------|
| Structure       | Ordered collection (index-based) | Key-value pairs                   | Unordered unique elements     |
| Duplicates      | Allowed                          | Keys - No, Values - Yes           | Not allowed                   |
| Null Handling   | Multiple nulls allowed           | One null key, multiple null vals  | One null allowed (HashSet)    |
| Examples        | ArrayList, LinkedList            | HashMap, LinkedHashMap, TreeMap   | HashSet, LinkedHashSet, TreeSet|
------------------------------------------------------------------------------------------
*/

// -------------------- Definitions --------------------

// List: An ordered collection that allows duplicates and null values. Examples: ArrayList, LinkedList
// Map: Stores key-value pairs with unique keys. Examples: HashMap, LinkedHashMap, TreeMap
// Set: A collection that does not allow duplicate elements. Examples: HashSet, LinkedHashSet, TreeSet

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // ......LIST AND LINKEDLIST.....
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("");
        list.add(4, "S");
        System.out.println("ArrayList: " + list);
        System.out.println("ArrayList get(2): " + list.get(2));

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("LinkedList get(2): " + linkedList.get(2));
    }
}

class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("X", 1);
        hashMap.put("Z", 2);
        hashMap.put("X", 3);
        hashMap.put(null, null);
        hashMap.put(null, null);
        hashMap.put("Z", null);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Z", 1);
        linkedHashMap.put("X", 2);
        linkedHashMap.put("Y", 3);
        linkedHashMap.put(null, null);
        linkedHashMap.put(null, null);
        linkedHashMap.put("Z", null);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z", 1);
        treeMap.put("X", 2);
        treeMap.put("Y", 3);
        System.out.println("TreeMap: " + treeMap);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("");
        hashSet.add("");
        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("E");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("");
        treeSet.add("");
        System.out.println("TreeSet: " + treeSet);
    }
}
