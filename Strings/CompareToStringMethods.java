package Strings;

public class CompareToStringMethods {
    static void main(String[] args) {
        String a = "Krushna";
        String b = "Hariom";
        System.out.println(a.compareTo(b));

        // New concept of InBuild method of string  that is concat
        a = a.concat(b);   // It is create the new string
        System.out.println(a);
    }
}
