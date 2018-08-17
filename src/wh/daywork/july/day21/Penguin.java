package wh.daywork.july.day21;
/**

 * @Author: wangheng

 * @Date: 2018/7/31 16:52

 * @param

 * @Description:

 *

 */
public class Penguin extends Pet {
    private String sex;
    /**

     * @Author: wangheng

     * @Date: 2018/7/31 16:53

     * @param name
     * @param sex
     *

     * @Description:

     *

     */
    public Penguin(String name,String sex){
        super(name);
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    /**
    *@Description: 重写父类的print()方法
    */
    @Override
    public void print(){
        super.print();
        System.out.println("性别是"+this.sex+"。 ");
    }


}
