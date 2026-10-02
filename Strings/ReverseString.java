package Strings;

public class ReverseString {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Radha");
        System.out.println(sb);

        // Reverse Code build
        int i = 0;
        int j = sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);

        String n = sb.reverse().toString();
        System.out.println(n);

        sb.delete(2,5);
        System.out.println(sb);

        sb.insert(2,'m');
        System.out.println(sb);

    }
}
