package Recursion;

import java.util.Scanner;

public class PowerLinear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base: ");
        int a =  sc.nextInt();
        System.out.println("enter exponent: ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power " + b + "is : "+ pow(a,b));
    }

}

