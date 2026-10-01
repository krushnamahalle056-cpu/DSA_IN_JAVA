package Strings;

public class InterningNew {
    public static boolean equal(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i))  return false;
        }
        return true;
    }
    static void main(String[] args) {
//        String s = "kartik";
//        s = "Ram";      // String are immutable (not change in string create the new string"
//
//        System.out.println(s);
//
//        String b = "ram";
//        String d = "ram";       // d point karega b vale  ram ko
//        System.out.println(b);
//        System.out.println(d);
//
//        String a = new String("kartik");  // create the new orignal string
//        System.out.println(a);
//
//        // String Immutability in Java
//        String st = "kanta";   // we want to convert this string kanta to Shanta
//        st = 'S' + 'h'+st.substring(2);
//        System.out.println(st);

        // Note : String are Immutable in Java for Security reason

        String s1 = "Raghav";
        String s2 = "Raghav";
//      System.out.println(s1 == s2);  // Output True
        System.out.println(equal(s1,s2));

        String s3 = new String("Raghav");
        String s4 = new String("Raghav");
        System.out.println(s3 == s4);       // Output false
        System.out.println(s3.equals(s4));  // Output true

    }
}
