package July.ex_20072024_If_else_switch;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);

        System.out.println(user_input);


        switch (user_input) {
            case 'a','A':
                System.out.println("Vowel");
                break;
            case 'e','E':
                System.out.println("Vowel");
                break;
            case 'i','I':
                System.out.println("Vowel");
                break;
            case 'o','O':
                System.out.println("Vowel");
                break;
            case 'u','U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It is Consonant");

        }

//        switch (user_input){
//            case 'a','e','i','o','u','A','E','I','O','U':
//             System.out.println("Character " +user_input+ " is Vowel");
//              break;
//              default:
//              System.out.println("Character " +user_input+ " is not Vowel It's Consonant");
//              }
//              }
//
    }
}
