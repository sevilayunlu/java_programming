package day42_maps;

import day28_encapsulation.personTask.Person;
import day33_abstraction.employeeTask.Developer;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice4 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        System.out.println(person1);
        System.out.println("---------------------------");
        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 6, 15));
        person2.put("married", true);

        System.out.println(person2.get("name"));

        System.out.println(person2);

        System.out.println("--------------------------");

        Map<String, Object> person3 = new LinkedHashMap<>();

        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-end Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);


        Map<String, Object> person4 = new LinkedHashMap<>();

        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 9, 15));
        person4.put("married", true);


        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Front-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 9, 15));
        person5.put("married", true);


        Map<Integer, Map<String, Object>> mapOfMaps = new LinkedHashMap<>();//the value can be a map
        mapOfMaps.put(0, person1);
        mapOfMaps.put(1, person2);
        mapOfMaps.put(2, person3);
        mapOfMaps.put(3, person4);
        mapOfMaps.put(4, person5);

        System.out.println(mapOfMaps);

        mapOfMaps.get(1).replace("salary", 120000);
        System.out.println(mapOfMaps.get(1));

        System.out.println("---------------------------------");
        for (Map<String, Object> eachValue : mapOfMaps.values()) {//all values
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {//each set
                if (eachEntry.getKey().equals("salary")) {//key of the map
                    eachEntry.setValue(((Integer) eachEntry.getValue()) + 10000);
                }
            }
        }

        System.out.println(mapOfMaps);

        System.out.println("---------------------------------------------");
        Map<Map<String,Integer>, Map<String,Integer>> mapOfMaps2 =new LinkedHashMap<>();//map supports non primitives so any kind of object will be supported in Map
        Map<int[], List<Integer>> map2=new LinkedHashMap<>();//array support  primitives and non primitives and at the end of the day, it is an object
        Map<Developer, Person> map3= new LinkedHashMap<>();
    }
}
