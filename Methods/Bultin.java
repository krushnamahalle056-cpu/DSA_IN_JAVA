package Methods;
public class Bultin{
    public static void sarthak(){
        vishal();
        System.out.println("Aishwarya");
    }
    public static void main(String[] args){
        Krushna();
    }
    public static void vishal(){
        System.out.println("shreya");
    }
    public static void Krushna(){
        vishal();
        sarthak();
        System.out.println("Radha");
        sarthak();

    }
}