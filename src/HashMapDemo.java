import java.util.Map;
import java.util.HashMap;
import java.util.*;


public class HashMapDemo {
    public static void main(String[] args) {

        //Initialize HashMap
        Map<String, Integer> score = new HashMap<>();

        score.put("Anubhav", 99);
        score.put("Kusum", 98);
        score.put("Manish", 97);
        score.put("Kusum", 96); // Duplicate key, will update value

        // Displaying the HashMap
        System.out.println(score.get("Anubhav")); // Output: 99
        System.out.println(score.get("Kusum"));   // Output: 96
        System.out.println(score.containsKey("Kusum")); // Output: true
        System.out.println(score.size()); // Output: 3

       //  System.out.println(score); // Output: {Anubhav=99, Kusum=96, Manish=97}

        score.remove("Manish");
        System.out.println(score.size()); // Output: 2

        // Iterating through the HashMap

        // 1. Iterrate over keys(keyset) - Use when we need only keys
        for(String key : score.keySet()){
            System.out.println(score.get(key));
        }

        // 2. Iterate over values - Use when we need only values
        for(int value : score.values()){
            System.out.println(value);
        }

        // 3. Iterate over key-value pairs (entrySet) - Use when we need both keys and values
        for(Map.Entry<String, Integer> entry : score.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //4. Some DSA Essentinal

        // A. getOrDefault()
        System.out.println(score.getOrDefault("Manish", 0)); // Output: 0

        //B. putIfAbsent()
        score.putIfAbsent("Ravi", 95);
        score.putIfAbsent("Kusum", 95); // Will not update as "Kusum" already exists

        //C. For the frequency mapping
        // scenario: Count frequency of characters in a string

        String s = "anubhav";
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+ 1);
        }
        System.out.println(map); // Output: {a=2, b=1, h=1, n=1, u=1, v=1}

        //D. Grouping the adjacency lists
        // scenario: Grouping words by their first character

        String[] words = {"apple", "banana", "apricot", "blueberry", "cherry"};
        Map<Character, Integer> newMap = new HashMap<>();
        for(String word: words){
            char firstChar = word.charAt(0);

        }
    }
}
