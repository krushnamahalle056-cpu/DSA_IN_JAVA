package Recursion;

public class FunctionCallingItself {
    static void main(String[] args) {
      vishal();
    }

    public static void vishal(){
        System.out.println("Shreya");
        vishal();      // It shows function call Itself
    }
}
