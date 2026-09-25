package Strings;
import java.util.Scanner;

public class NumberOfVowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0;i < s.length(); i++){
            char alf = s.charAt(i);
            if(alf == 'a' || alf == 'e' || alf == 'i'  ||alf == 'o' ||alf == 'u'){
                count++;
            }
            System.out.println("number of vowels is " + count);
        }

    }
}
