package MultiDimentionalArrays;

import java.util.ArrayList;

public class SpiralMatrix {
    static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int Fc = 0, Lc = m-1 , Fr = 0, Lr = n-1;
        while(Fr< Lr && Fc < Lc){
            // left to right
            for(int j = Fc ; j <= Lc ; j++){
                ans.add(mat[Fr][j]);
                Fr ++;
            }

            // top to bottom
            for(int i = Fr; i <= Lr ; i++){
                ans.add(mat[i][Lc]);
                Lc --;
            }

            // right to left
            for(int j = Lc ; j>=Fc; j--){
                ans.add(mat[Fc][j]);
                Fc ++;
            }

            // bottom to top
            for(int i = Lr; i>=Fr; i--){
                ans.add(mat[i][Fc]);
                Lr --;
            }

        }


    }

}
