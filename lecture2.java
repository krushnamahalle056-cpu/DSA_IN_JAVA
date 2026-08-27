import java.util.*;

class lecture2 {

    public static void enterName(String name){
        System.out.println("My name is " + name);
    }


    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        // System.out.print("Enter the value of a : ");
        // int b = sc.nextInt();
        // System.out.print("Enter the value of b : ");
        // int c = sc.nextInt();
        // int sum = b+c;
        // System.out.print(sum);

        // Conditional Statement 

        // int age = 18;
        // if(age >= 18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not Adult");
        // }

        // System.out.print("Enter any number : ");
        // int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("this is a even number");
        // }else{
        //     System.out.print("this is odd number");
        // }

        // // Switch statement 

        // System.out.print("Enter value 1 to 7 : ");
        // int day = sc.nextInt();
        // switch(day){
        //     case 1: System.out.println("sunday");
        //     break;
        //     case 2: System.out.println("monday");
        //     break;
        //     case 3: System.out.println("tuesday");
        //     break;
        //     case 4: System.out.println("wednday");
        //     break; 
        //     case 5: System.out.println("thusday");
        //     break;
        //     case 6: System.out.println("friday");
        //     break;
        //     case 7: System.out.println("saturday");
        //     break;
        //     default: System.out.println("Enter the currect number");

        // }

        // Functions in JAVA
        System.out.print("Enter your name: ");
        String studentName = sc.next();

        enterName(studentName);
        
        




    }
}
