package array;

import java.util.Scanner;

public class ArrayBasics {
    static void main(String[] args) {
//        int[] arr = {23,22,21,64,43,34};
//        System.out.println("element in array : " + arr[5]);
//        arr[5]=5;
//        System.out.println("element in array : " + arr[5]);
//
//        // Initialization of array
//        int[] arry = new int[2];

//        // Output of array
//        for(int a=0;a<arr.length;a++){
//            System.out.print(arr[a]+" ");
//        }

        // input form the user
//        int[] arr = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 integers");
//        for(int i=0; i<5; i++){
//            int x = sc.nextInt();
//            arr[i] = x;
//        }
//        System.out.print("The final array is :");
//        for(int i=0; i<5; i++){
//            System.out.print(arr[i]+" ");
//        }
//
//
//         // Que: given an array print negative element
//
//        int[] a = {23,-34,45,-25,55,45};
//        for(int i=0;i<a.length;i++){
//            if(a[i]<0){
//                System.out.println(a[i]);
//            }
//        }

//        // Que: Print sum of element of arry
//        int[] b = {2,3,4,5,6,7,8};
//        int sum = 0;
//        for(int i=0;i<b.length;i++){
//            sum+=b[i];
//        }
//        System.out.println(sum);

//        // Que: Print product of element of the array
//        int[] b = {2,3,4,5,6,7,8};
//        int pro = 1;
//        for(int i=0;i<b.length;i++){
//            pro *=b[i];
//        }
//        System.out.println(pro);

//        // Que: Print largest in the array
//        int[] b = {33,35,45,53,64,7,84};
//        int max = b[0];
//        for(int i=0;i<b.length;i++){
//            if(b[i]>max){
//                max=b[i];
//            }
//        }
//        System.out.println(max);
//
//
//         // String array
//        String[] arr={"Krushna", "Sarthak", "Vishal", "Hariom", "Pavan"};
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        };

//        // Que : Multiply odd indexed elements by 2 and add 10 to even endexed elements
//
//        int[] arr = {10,20,30,40,50,60};
//        for(int i=0;i<arr.length;i++){
//            if(i%2!=0){
//                arr[i] *= 2;
//            }else{
//                arr[i] += 10;
//            }
//            System.out.println(arr[i]);
//        }

//        // Que : Search in array
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {123,31,443,342,21,33,22};
//
//        System.out.print("Enter the target number: ");
//        int target = sc.nextInt();
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == target){
//
//            System.out.println("Target number is found ! The number is: " + arr[i]);
//            return ;
//            }
//        }
//        System.out.println("Target is not in array ");
//
         // Que : Print the second Maximum element in the array

        int[] arr = {4,10,10,6,3,8};
        int max = arr[0];
        int mx = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>mx ){
                mx = arr[i];
            }
        }
        System.out.println("The Maximum number is : "+ max);
        System.out.println("The Second Maximum number is : "+ mx);

    }
}
