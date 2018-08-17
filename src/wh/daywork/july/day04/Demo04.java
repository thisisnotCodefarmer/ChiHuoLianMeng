package wh.daywork.july.day04;

public class Demo04 {
    public static void main(String args[]){
        int i=1;
        while (i<=3) {
            if (i == 1) {


                System.out.print("*");
                i++;
                continue;
            } else if (i == 2) {
                System.out.print("**");
                i++;
                break;
            }
        }

    }
}
