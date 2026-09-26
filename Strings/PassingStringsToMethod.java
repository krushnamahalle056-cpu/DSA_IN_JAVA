package Strings;

public class PassingStringsToMethod {
    public static void change(String x){
        x = "Sahil";
    }
    static void main(String[] args) {
        String x = "Krushna";
        System.out.println(x);
//        x = "Lavany dada";      // aisa define kiya to change hota hai
        change(x);
        System.out.println(x);

        // Note : String are immutable (function main string ki value change ki to orignal main change nhi hoti)
        // Note : Arrays are mutable
    }
}
