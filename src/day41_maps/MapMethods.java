package day41_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khaskavar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("A04"));
        map.put("A04", "Lucy");//values can be changed but the keys are unchangeable
        map.put("A06", "Adivar");

        System.out.println(map);

        System.out.println(map.get("B03"));

        map.replace("C02", "Aseel");
        map.replace("A06", "Marika");

        System.out.println(map);

        map.remove("A05");
        System.out.println(map);

        System.out.println(map.containsKey("B03"));
        System.out.println(map.containsKey("H67"));

        System.out.println(map.containsValue("Lucy"));
        System.out.println(map.containsValue("Sevilay"));

        System.out.println(map.isEmpty());
        System.out.println(map.equals(map));








    }


}









/*
pair:id-name

*/