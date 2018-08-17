package wh.daywork.july.day10;

/**

 * @Author: wangheng

 * @Date: 2018/7/23 14:32

 * @param

 * @Description:

 *答应圣诞树 三部分 ： 上中 为两个六行等腰三角形 下为长度为六的直线

 */

public class ShengDanShu {
    public static void sanJiao(int x){

        for (int i = 1; i <= x; i++) {
            for (int j =  1; j <= x-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
            sanJiao(5);
            sanJiao(6);
    }
}
