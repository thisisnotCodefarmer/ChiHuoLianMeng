package wh.daywork.july.day06;

public class Demo106 {
    public static void main(String[] aegs) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            do {
                i++;
                if (i % 2 != 0) {
                    sum += i;
                }
            } while (i < 6);
        }
        System.out.println(sum);
    }
}

