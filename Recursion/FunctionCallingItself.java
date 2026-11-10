package Recursion;

public class FunctionCallingItself {
    static void main(String[] args) {
      print(6);
    }

//    public static void vishal(){
//        System.out.println("Shreya");
//        vishal();      // It shows function call Itself
//    }

    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }

}
