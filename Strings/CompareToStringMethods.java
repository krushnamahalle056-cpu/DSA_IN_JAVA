package Strings;

public class CompareToStringMethods {
    static void main(String[] args) {
        String a = "Krushna";
        String b = "Hariom";
        System.out.println(a.compareTo(b));

        // New concept of InBuild method of string  that is concat
        a = a.concat(b);   // It is create the new string
        String c = a+b;   // '+' also use for concat
        System.out.println(c);
        System.out.println(a);
        a+= "Hi My Name is Krushna";  // concat new string
        System.out.println(a);
        a+= "32";                    // concat the Integer
        System.out.println(a);
        a+= 'a';                    // concat the char
        System.out.println(a);
        a+= "/n";
        System.out.println(a);
        a+= 'n';
        System.out.println(a);

    }
}
