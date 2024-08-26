package August.ex_24082024;

import java.util.HashMap;
import java.util.Map;

public class Lab244 {
    public static void main(String[] args) {
        // Map  - key and value pair
        // name:pramod, roll:31, phone:9876543210
        Map m1 = new HashMap();                //randomly stored
//        Map m1 = new LinkedHashMap();        // how you have given in order
//        Map m1 = new TreeMap();               // based on alphabets n,p,r
        m1.put("name", "pramod");
        m1.put("rollNo", 123);
        m1.put("phone", 98765432);
        System.out.println(m1);


    }
}
