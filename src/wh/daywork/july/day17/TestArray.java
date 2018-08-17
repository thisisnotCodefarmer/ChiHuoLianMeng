package wh.daywork.july.day17;


import java.util.Arrays;

public class TestArray {


    public static void arrAdd() {
        int[] arr1= {12,32,4,34};
        int[] arr2= {99,11,24};
        int[] arr3=new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);

        Arrays.sort(arr3);
        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j]+" ");
        }
    }

    public static void main(String[] args) {
        arrAdd();
    }
}


