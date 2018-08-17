package wh.daywork.july.day18;

import java.util.Arrays;

public class NumberToChar {
    private String[] fanArr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖",};

    private String[]  shuArr={"十","百","千",};

    /**

     * @Author: wangheng

     * @Date: 2018/7/30 14:21
     *
     * 把一个浮点数分解成整数部分和小数部分字符串

     * @param num 需要被分解出来的浮点数

     * @return  分解出来的整数部分和小数部分，第一个数组元素 是整数部分，第二个数组元素是小数部分

     * @Description:

     *

     */
    private String[] divide(double num)
    {

        //强制转换成 long型，得到整数部分
        long zheng=(long) num;
        //浮点数减去整数部分 得到小数部分，小数部分乘以100 在取整得到2位小数
        long xiao=Math.round((num-zheng)*100);
        //整数转换成字符串
        return new String[]{zheng+"",String.valueOf(xiao)};
    }
    /**

     * @Author: wangheng

     * @Date: 2018/7/31 15:06
     *
     * 把一个四位的数字字符串变成汉字字符串

     * @param numStr 需要被转换的四位数字字符串
        @return  四位的数字字符串被转换成汉字字符串
     * @Description:

     */
    private String toHanStr(String numStr){
        String result="";
        int numLen=numStr.length();
        for(int i=0;i<numLen;i++){
            //把char型数字转换成int型数字，因为他们的ASCII 码值恰好相差48
            //因此把char型数字减去48得到int型数字，例如'4'被转换成4
            int num=numStr.charAt(i)-48;
            //如果不是最后一位数字，而且数字不是零，则需要添加单位（千百十）
            if(i!=numLen-1&&num!=0){
                result+=fanArr[num]+shuArr[numLen-2-i];
            }
            else{
                result+=fanArr[num];
            }
        }
        return result;
    }
    public static void main(String[]args){
        NumberToChar nc=new NumberToChar();
        System.out.println(Arrays.toString(nc.divide(24432423432.2334)));
        System.out.println(nc.toHanStr("1205"));
    }
}
