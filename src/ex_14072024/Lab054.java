package ex_14072024;

public class Lab054 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        //byte c = a+b; not possible because byte(1st operand)+byte(2nd operand) = int
        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // AB ->char - char c1 = a1+b1; not possible because it will become string, so int
        System.out.println(c1); //(65+66) - ASCII table
        System.out.println('A' == 65); //true because 'A' = 65 in ascii
        System.out.println('B' == 69); //false beacuse 'B' = 66 in ascii

    }
}
