package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khaskavar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        map.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });

//k is the variable for all keys and v is the variable for all values.
//If we need to write a code fragment we must use curly brackets after arrow token. Otherwise, we do not need to use it.




    }
}
