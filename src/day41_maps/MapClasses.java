package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {


        Map<String,Integer> hashMap=new HashMap<>();//random order,accept null key & null values

        hashMap.put("Daniel", 95000);//size:1
        hashMap.put("Emily", 100000);
        hashMap.put("Bella",85000);
        //map1hs.put("Daniel", 80000);//to update the pair, it is enough to write it again
        hashMap.put("Arron", 95000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 12000);
        hashMap.put(null, 67000);
        hashMap.put(null, 89000);


        System.out.println("hashMap = " + hashMap);//{Emily=100000, Daniel=95000, Bella=85000}==Hashmap maintains the random order
        
        System.out.println("---------------------------------------------------------------------");
        
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();//insertion order,accept null key & null values
        linkedHashMap.put("Daniel", 95000);//size:1
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella",85000);
        //map1hs.put("Daniel", 80000);//to update the pair, it is enough to write it again
        linkedHashMap.put("Arron", 95000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 12000);
        linkedHashMap.put(null, 67000);
        linkedHashMap.put(null, 89000);

        System.out.println("linkedHashMap = " + linkedHashMap);//{Daniel=95000, Emily=100000, Bella=85000, Arron=95000, Chris=null, Breanna=null, null=89000}==i the insertion order
        System.out.println("---------------------------------------------------------------------");
        
        Map<String,Integer> treeMap=new TreeMap<>();//sorted order,does not accept duplicates(value can be null)

        treeMap.put("Daniel", 95000);//size:1
        treeMap.put("Emily", 100000);
        treeMap.put("Bella",85000);
        //map1hs.put("Daniel", 80000);//to update the pair, it is enough to write it again
        treeMap.put("Arron", 95000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
        //treeMap.put(null, 12000);//key cannot be null in treeMap
        //treeMap.put(null, 67000);
        //treeMap.put(null, 89000);

        System.out.println("treeMap = " + treeMap);//{Arron=95000, Bella=85000, Breanna=null, Chris=null, Daniel=95000, Emily=100000}== keys are in sorted order

        System.out.println("---------------------------------------------------------------------");

        Map<String,Integer> hashtable=new Hashtable<>();//maintains random order, does not accept null as a key, synchronized

        hashtable.put("Daniel", 95000);//size:1
        hashtable.put("Emily", 100000);
        hashtable.put("Bella",85000);
        //map1hs.put("Daniel", 80000);//to update the pair, it is enough to write it again
        hashtable.put("Arron", 95000);
        //hashtable.put("Chris", null);//value in hashtable cannot be null
        //hashtable.put("Breanna", null);//value in hashtable cannot be null
        //hashtable.put(null, 12000);//key in hashtable cannot be null
        //hashtable.put(null, 67000);//key in hashtable cannot be null


        try {
            hashtable.put("Diana", 89000);
        }catch(RuntimeException e){
            e.printStackTrace();
        }


        System.out.println(hashtable);


    }
}
/*
pair:name & salary
Daniel=95000
Emily=100000
Bella=85000
 */