package wh.daywork.july.day24;

/**
* @Description:
 * 2.某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：
 * 每位数字都加上5,
 * 然后用和除以10的余数代替该数字，
 * 再将第一位和第四位交换，
 * 第二位和第三位交换。
* @Param:
* @return:
* @Author: Mr.Wang
* @Date: 2018/8/2
*/
public class PhonePassword {
    public int encrypt(int num) {

        int[] arr = transfer(num);
        int[] pwd = new int[4];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            pwd[i] = arr[i] + 5;
            if (pwd[i] < 10) {
                pwd[i] += 10;
                pwd[j] = pwd[i] % 10;
            } else {
                pwd[j] = pwd[i] % 10;
            }
            int temp = 0;
            {
                temp = pwd[3];
                pwd[3] = pwd[0];
                pwd[0] = temp;
            }
            {
                temp = pwd[2];
                pwd[2] = pwd[1];
                pwd[1] = temp;
            }
        }

        return num;

    }



    public int decrypt(int num) {
        int repassword = 0;


        return repassword;
    }

    public int[] transfer(int num) {
        String str = null;
        str = Integer.toString(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            char c=str.charAt(i);
            String s=String.valueOf(c);
            int a=Integer.parseInt(s);
            arr[i]=a;
        }
        return arr;
    }
}

