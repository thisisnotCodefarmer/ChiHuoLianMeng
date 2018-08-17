package wh.daywork.july.day21;
/**

 * @Author: wangheng

 * @Date: 2018/7/31 16:49

 * @param

 * @Description:

 *

 */
public class Dog extends Pet {
    private String strain;
    /**

     * @Author: wangheng

     * @Date: 2018/7/31 16:50

     * @param name
     * @param strain

     * @Description:

     *

     */
    public Dog(String name ,String strain){
        super(name);
        this.strain=strain;
    }
    public String getStrain(){
        return strain;
    }
    /**
    *@Description:  重写父类的print()方法
    */

    @Override
    public void print(){

        super.print();
        System.out.println("我是一只"+this.strain+"。");
    }


}



