package wh.daywork.july.day07;

import java.util.Arrays;

public class Demo067 {
    public static void main(String[]args){
        //判断两个数组是否相等
        int[] arr1={10,40,50,30};
        int[] arr2={10,40,50,30};
        int[] arr3={60,50,75};

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));

        //将数组arr1转换成字符串并输出
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //将数组所有的元素赋值为相同的值
        Arrays.fill(arr1,40);
        System.out.println(Arrays.toString(arr1));

        //将数组赋值成一个长度为设定值的新数组
        int[] arr4=Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr4));
        int[] arr5=Arrays.copyOf(arr2,2);
        System.out.println(Arrays.toString(arr5));

        //查询元素在数组中的下标
        int[] arr6={10,50,40,30};
        Arrays.sort(arr6);
        int index=Arrays.binarySearch(arr6,30);
        System.out.println(index);
        index=Arrays.binarySearch(arr6,40);
        System.out.println(index);

        //二维数组的遍历
        int[][] arr=new int[][]{{80,60},{70,54,98},{77,59}};
        int total;
        for (int i=0;i<arr.length;i++){
            String str=(i+1)+"班";
            total=0;
            for (int j=0;j<arr[i].length;j++){
                total+=arr[i][j];
            }
            System.out.println(str+"总成绩是："+total);
        }

        //


    }

}
