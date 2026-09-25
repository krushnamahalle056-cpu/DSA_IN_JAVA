package Strings;

import java.util.Scanner;

public class StringBasics {
    static void main(String[] args) {
//        char[] arr = {'a', 'd', 'c'};
//        for(char ele: arr){
//            System.out.print(ele +" ");
//        }

//        // Declaration of String
//        String str = "Hello Krushna";
//        System.out.println(str);
//
//        // input string from user
          Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your full Name : ");
//        String str = sc.next();         // sc.next() gives the first word of full sentence as output
//        System.out.println("Your full Name is: " + str);

        System.out.print("Enter Branch Name : ");
        String branch = sc.nextLine();   // sc.nextLine() gives the full sentence as output
        System.out.println("Branch Name is: " + branch);


    }
}
