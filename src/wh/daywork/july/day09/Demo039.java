package wh.daywork.july.day09;
//机试题1 输出乘法口诀表
public class Demo039 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        int[] b = new int[]{1,2,3,4,5,6,7,8,9};
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(a[j] + "*" + b[i] + "=" + (a[i] * b[j]) + "\t");
            }
            System.out.println("");
        }

    }
}
