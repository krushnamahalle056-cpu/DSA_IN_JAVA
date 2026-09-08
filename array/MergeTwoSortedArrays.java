package array;

import static java.io.ObjectInputFilter.merge;

public class MergeTwoSortedArrays {
    static void main(String[] args) {
        int[] a = {1,3,5,7,8};
        int[] b = {2,4,6,9,10,22,24};
        int[] c = new int[a.length+b.length];
        merge(c,a,b);


    }

    public static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] =  a[i];
                i++;
                k++;
            }else if(a[i]>b[j]){
                c[k] =  b[j];
                j++;
                k++;
            }
        }
    }
}
