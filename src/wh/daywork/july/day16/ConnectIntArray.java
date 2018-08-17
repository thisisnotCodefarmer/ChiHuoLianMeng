package wh.daywork.july.day16;

import java.util.Arrays;

public class ConnectIntArray {
    private static void IntArray(int a[], int b[], int arr[]) {
        int c[] = Arrays.copyOf(a, a.length + b.length);

        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] + " ");

        }
    }
}
