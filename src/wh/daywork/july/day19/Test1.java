package wh.daywork.july.day19;

import java.util.Arrays;
/**

 * @Author: wangheng

 * @Date: 2018/7/31 18:46

 * @param

 * @Description:

 *

 */
public class Test1 {
        public int[] connect1(int[] a ,int[] b){
            int[]  c=new int[a.length+b.length];
            for (int i=0;i<a.length;i++){
                c[i]=a[i];
            }
            for (int i=a.length;i<c.length;i++){
                c[i]=b[i-a.length];
            }
            Arrays.sort(c);


            return c;
        }

        public static void  main(String[] args){
            Test1 t=new Test1();
            int[] a={1,2,3,4,5};
            int[] b={6,7,8};
            int[] c=t.connect1(a,b);
            for (int i :c) {
                System.out.print(i+"\t");
            }

        }
}
