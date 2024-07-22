package HomeWork;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        //based on the following criteria:
//        Equilateral : All sides are equal
//        Isosceles : Two sides are equal
//        Scalene :  no sides are equal.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the triangle side1");
        int side1 = sc.nextInt();

        System.out.println("Enter the triangle side2");
        int side2 = sc.nextInt();

        System.out.println("Enter the triangle side3");
        int side3 = sc.nextInt();

        if (side1==side2 && side2==side3) {
            System.out.println("It is an equilateral triangle");
        }else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("It is an Isosceles triangle");
        }else {
            System.out.println("It is a scalene triangle");
        }

    }
}
