package MultiDimentionalArrays;

import java.util.ArrayList;

public class SpiralMatrix {

    static ArrayList<Integer> spirallyTraverse(int[][] mat) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        int Fc = 0, Lc = m - 1;
        int Fr = 0, Lr = n - 1;

        while (Fr <= Lr && Fc <= Lc) {

            // Left to right
            for (int j = Fc; j <= Lc; j++) {
                ans.add(mat[Fr][j]);
            }
            Fr++;

            // Top to bottom
            for (int i = Fr; i <= Lr; i++) {
                ans.add(mat[i][Lc]);
            }
            Lc--;

            // Right to left
            if (Fr <= Lr) {
                for (int j = Lc; j >= Fc; j--) {
                    ans.add(mat[Lr][j]);
                }
                Lr--;
            }

            // Bottom to top
            if (Fc <= Lc) {
                for (int i = Lr; i >= Fr; i--) {
                    ans.add(mat[i][Fc]);
                }
                Fc++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(spirallyTraverse(mat));
    }
}