package July.ex_20072024_If_else_switch;

public class Lab086 {
    public static void main(String[] args) {
        // Modulus - %
        // 10%2 -> 0
        // 11%2 -> 1
//        2 | 11 | 5 - Q
//            10
//           -----
//            1 - R

        int num = 11;
        if(num%2 == 0){                  //(1==0)
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
