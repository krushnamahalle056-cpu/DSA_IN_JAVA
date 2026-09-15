package Random_Question;

public class Squre_Root {
    static void main(String[] args) {
        int n = 81;
        int root = 0;
        for(int i =1; i<=n; i++){

            if(i*i>n){
                break;
            }
            root = i;
        }
        System.out.println(root);

        // Time Complexity: O(√n)
        // Space Complexity = O(1)
    }
}

