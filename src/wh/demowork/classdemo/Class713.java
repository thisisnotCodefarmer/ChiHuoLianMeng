package wh.demowork.classdemo;

/*
8种基本类型


 */

public class Class713 {
    public static void main(String aegs[]) {
        int i = 0;
        while (i < 6) {
            if (i % 2 == 1) {
                i++;
                continue;
            }
            if (i % 4 == 0) {
                continue;

            }
            i++;
        }


        System.out.println(i);
    }
}
