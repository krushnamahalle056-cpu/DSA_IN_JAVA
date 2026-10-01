package Strings;

public class InterningNew {
    static void main(String[] args) {
        String s = "kartik";
        s = "Ram";      // String are immutable (not change in string create the new string"

        System.out.println(s);

        String b = "ram";
        String d = "ram";
        System.out.println(b);
        System.out.println(d);


    }
}
