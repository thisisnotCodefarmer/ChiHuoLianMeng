package wh.daywork.july.day09;
import java.util.Scanner;

public class Demo029 {

    public static void pln(Object o) {
        System.out.println(o);
    }

    public int sumAdd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            pln(arr[i]);

            sum += arr[i];

        }
        pln(sum);
        return sum;
    }


        public static void main(String[] args) {

            int[] arr = new int[]{8, 4, 2, 1, 23, 344, 12};

            Scanner input = new Scanner(System.in);
            pln("输入数字:");
            int i = input.nextInt();

            for (int a : arr) {
                if (a == i) {
                    pln("有");
                } else {
                    pln("无");
                }
            }
        }
    }


