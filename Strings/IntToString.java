package Strings;

import java.util.Scanner;

public class IntToString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//        String s = "";     // empty string
//        s += n;

        String s = Integer.toString(n);    // Integer ko string main convert karta hai

        System.out.println(s);
    }
}
