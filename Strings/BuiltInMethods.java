package Strings;

public class BuiltInMethods {
    static void main(String[] args) {
        String str = "afDEEIOAWEkdfgheriKDDFV";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String s = "Harshika";
        System.out.println(s.contains("Harsh"));     // contains method give the answer in the form of true or false
        System.out.println(s.contains("ishika"));

        if(s.contains("shika")){
            System.out.println("Happy");
        }

        System.out.println(s.startsWith("H"));  // startsWith and endsWith also gives the output in the form of true or fals
        System.out.println(s.endsWith("ja"));

    }
}
