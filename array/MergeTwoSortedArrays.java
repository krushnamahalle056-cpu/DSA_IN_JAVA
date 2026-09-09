package array;

import static java.io.ObjectInputFilter.merge;

public class MergeTwoSortedArrays {
    static void main(String[] args) {
        int[] a = {1,3,5,7,8};
        int[] b = {2,4,6,9,10,22,24};
        int[] c = new int[a.length+b.length];
        for(int ele: c) System.out.print(ele + " ");
        System.out.println();
        merge(c,a,b);
        for(int ele: c) System.out.print(ele + " ");
    }

    public static void merge(int[] c,int[] a,int[] b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] =  a[i];
                i++;

            }else if(a[i]>b[j]){
                c[k] =  b[j];
                j++;

            }
            k++;
        }
        if(i==a.length){  // a array khatam -> b ke bache hue ele lo
            while(j<b.length){
                c[k] =  b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){  // b array khatam -> a ke bache hue ele lo
            while(i<a.length){
                c[k] =  b[i];
                i++;
                k++;
            }
        }
    }
}