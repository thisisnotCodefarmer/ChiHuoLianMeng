package wh.daywork.july.day11;

public class Except5 {

    public static void  shuChu() {
        for (int i = 0; i <= 100; i++) {
            if (i / 10 % 10 != 5 && i % 10 != 5) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
       shuChu();

    }
}
