package Strings;

public class Plus {
    static void main(String[] args) {
        String s = "gopi";
//        System.out.println(s.substring(0,s.length()-1));
        for(int i = 0; i<s.length(); i++){
            for(int j = 0+i ; j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" ");
            }
            System.out.println(" ");
        }
    }
}
