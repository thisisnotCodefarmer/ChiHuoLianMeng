package wh.daywork.july.day02;

public class Prog3 {
    private static boolean lotus(int lotus) {
        int m = 0;
        int n = lotus;
        int sum = 0;
        m = n / 100;
        n -= m * 100;
        sum = m * m * m;
        m = n / 10;
        n -= m * 10;
        sum += m * m * m + n * n * n;
        if (sum == lotus)
            return true;
        else
            return false;
    }


    public static void main(String args[]){
        for(int i=100;i<1000;i++){
            if (lotus(i))
                System.out.print(i+"\t");
        }
        System.out.println();
    }
}
