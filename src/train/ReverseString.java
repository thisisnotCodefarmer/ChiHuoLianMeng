package train;

public class ReverseString {
    /**

     * @Author: wangheng

     * @Date: 2018/7/16 9:31

     * @param string倒序输出1

     * @Description:利用String类的toCharArray(),在倒序输出数组的方法

     *

     */
    private   static void reverseString1(String str){
        char[] chr=str.toCharArray();
        for (int i=chr.length-1;i>=0;i--){
            System.out.print(chr[i]);
        }
        System.out.println("\t");
    }
    /**

     * @Author: wangheng

     * @Date: 2018/7/16 9:40

     * @param string倒序输出2

     * @Description:利用String类提供的subString（）方法，利用地柜的办法输出倒序字符串

     *

     */
    private static void reverseString2(String str){
        if (str.length()==1)
            System.out.println(str);
        else {
            String subString1=str.substring(0,str.length()-1);
            String subString2=str.substring(str.length()-1);

            System.out.print(subString2);
            reverseString2(subString1);
        }
    }
    /**

     * @Author: wangheng

     * @Date: 2018/7/16 9:46

     * @param string逆序输出3

     * @Description:定义一个StringBuffer类，用StringBuffer类中的reverse（）方法直接倒序输出

     *

     */
    private static void reverseStrng3(String str){
        StringBuffer buffer=new StringBuffer(str);
        System.out.println(buffer.reverse());

    }
    public static void main(String args[]){
        String str1="abc";
        System.out.println(str1.substring(2));

        String str="holle world";
        //四种方式
        reverseString1(str);
        reverseString2(str);
        reverseStrng3(str);
    }
}
