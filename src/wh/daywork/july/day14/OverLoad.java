package wh.daywork.july.day14;

public class OverLoad {
    /**

     * @Author: wangheng

     * @Date: 2018/7/26 11:18

     * @param

     * @Description:
     * 重载
     * 1在同一类中（作用域）
     * 2方法名相同
     * 3参数列表不同（类型个数顺序）
       4与返回值类型无关
     *

     */
    public  int print(int a){
        return a;
    }
    public int print(int a,int b){
        return a+b;
    }

}
