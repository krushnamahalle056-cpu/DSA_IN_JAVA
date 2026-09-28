package Strings;

public class CreateCompareToMethod {
    public static int myCompareTo(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        // If common part is same, shorter string comes first
        return s1.length() - s2.length();
    }
        return -1;
    }
    static void main(String[] args) {
        CompareTo("Krushna", "Hariom");
    }
}
