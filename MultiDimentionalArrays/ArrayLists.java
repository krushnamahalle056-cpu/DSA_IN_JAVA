package MultiDimentionalArrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(11); a.add(13); a.add(36); a.add(23);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(47); b.add(15); b.add(16); b.add(22);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(31); c.add(43); c.add(56); c.add(13);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(43); d.add(53); d.add(22); d.add(21);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c); arr.add(d);

        for(int i = 0; i<arr.size();i++){
            for(int j = 0; j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }


}
