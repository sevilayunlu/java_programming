package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Object> person1=new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender",'M');
        person1.put("age",32);
        person1.put("job_title","Developer");
        person1.put("salary",100000.5);
        person1.put("married",true);

        System.out.println(person1);

        System.out.println(person1.get("name"));//keys behave like index numbers
        System.out.println(person1.get("salary"));//get() method of the map accepts just keys
        System.out.println(person1.get("job_title"));





    }
}
