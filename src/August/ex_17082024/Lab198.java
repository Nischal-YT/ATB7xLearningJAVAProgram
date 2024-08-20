package August.ex_17082024;

public class Lab198 {
    public static void main(String[] args) {
        Double d = 3.14; // stored in HEAP///this is wrapper class
        double val = d.doubleValue(); // stored in Continuous Memory ///this is primitive
        System.out.println(d);
        System.out.println(val);

        String s1 = "pramod"; // SCP
        String s2 = new String("pramod"); // HEAP


    }
}
