package day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("John", "M");
        map.put("Antony", "M");
        map.put("Jimmy", "F");
        map.put("Jalil", "F");
        map.put("James", "M");
        map.put("Conor", "F");
        map.put("Josh", "M");
        map.put("Cory", "F");
        map.put("Anderson", "M");
        map.put("Steven", "F");

        System.out.println("----------------------------------------");
        int countMale = 0;
        int countFemale = 0;

        /* for (String name: map.keySet()) {
            String gender=map.get(name);
            if(gender.equals("M")){
                countMale++;
            }else{
                countFemale++;
            }
        }*///if we need just the value of from the map, no need to use keySet

        /*   for (String eachValue : map.values()) {
            if(eachValue.equals("F")){
                countFemale++;
            }else{
                countMale++;
            }
        }*/
        
        /*System.out.println("countMale = " + countMale);
        System.out.println("countFemale = " + countFemale);

        System.out.println("----------------------------------------");

        for (String eachKey : map.keySet()) {
            String gender= map.get(eachKey);
            if(gender.equals("F")){
                countFemale++;
            }else{
                countMale++;
            }
        }
        System.out.println("countMale = " + countMale);
        System.out.println("countFemale = " + countFemale);*/


        for (Map.Entry<String, String> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("-------------------------------------");

        for (Map.Entry<String, String> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().equals("M")) {
                eachEntry.setValue("Male");
            } else {
                eachEntry.setValue("Female");
            }
        }

        System.out.println(map);


    }
}
/*
Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
 */