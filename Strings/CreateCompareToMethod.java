package Strings;

public class CreateCompareToMethod {
    public static int CompareTo(String a, String b){
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < b.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    return 0;
                }else if(a.charAt(i) != b.charAt(j)){
                    if(a.charAt(i) >  b.charAt(j)){
                        System.out.println(i);
                    }
                }
            }
        }
        return -1;
    }
    static void main(String[] args) {
        CompareTo("Krushna", "Hariom");
    }
}
