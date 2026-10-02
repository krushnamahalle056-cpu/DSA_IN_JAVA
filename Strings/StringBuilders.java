package Strings;

public class StringBuilders {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Krushna");
        System.out.println(sb.length() + " "+sb.capacity());
        System.out.println(sb);
        sb.append("mahalle");      // append means add last
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.insert(2,'i');
        System.out.println(sb);
        sb.delete(12,14);
        System.out.println(sb);

    }
}
