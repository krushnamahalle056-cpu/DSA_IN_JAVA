package Strings;

public class InterningNew {
    static void main(String[] args) {
        String s = "kartik";
        s = "Ram";      // String are immutable (not change in string create the new string"

        System.out.println(s);

        String b = "ram";
        String d = "ram";       // d point karega b vale  ram ko
        System.out.println(b);
        System.out.println(d);

        String a = new String("kartik");  // create the new orignal string
        System.out.println(a);

        // String Immutability in Java
        String st = "kanta";   // we want to convert this string kanta to Shanta
        st = 'S' + 'h'+st.substring(2);
        System.out.println(st);



    }
}
