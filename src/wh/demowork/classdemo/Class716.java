package wh.demowork.classdemo;

/**
 * @param 流程控制
 * @Author: wangheng
 * @Date: 2018/7/16 10:03
 * @Description： 流程控制
 * 1.顺序结构：按照程序的既定顺序依次执行，从上到下，从左到右，从前到后
 * 2.选择结构：分支结构 条件结构
 */
public class Class716 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i > 0; i--) {
            if (i % 3 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

    }
}
