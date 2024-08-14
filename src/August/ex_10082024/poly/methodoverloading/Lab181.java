package August.ex_10082024.poly.methodoverloading;

public class Lab181 {

    //***********PolyMorphism*************//
    //***Method overloading means - One or more method with the same name but different arguments***//

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2,3);
        double result2 = mathOperations.add(2.4, 3.6);
        String result3 = mathOperations.add("Nischal", "Y T");
        String result4 = mathOperations.add("Nischal", 524);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
