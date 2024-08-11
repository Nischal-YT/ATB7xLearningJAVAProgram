package July.HomeWork;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : a");
        int a = 5;
        System.out.println("Enter the second number : b");
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a+b; //15
        b = a-b; //5
        a = a-b; //10
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
