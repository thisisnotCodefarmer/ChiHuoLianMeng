package wh.daywork.july.day21;
/**

 * @Author: wangheng

 * @Date: 2018/7/31 16:35

 * @param

 * @Description:

 *

 */
public class Pet {
    private String name= "无名氏";
    private int health=100;
    private int love=0;

    public Pet(){
        this.health=95;
        System.out.println("执行的宠物无参构造方法：");
    }
    public Pet(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getLove(){
        return love;
    }
    public void print(){
       System.out.println("宠物的自白：\n我的名字叫"
       +this.name+",我的健康值是："+this.health
               +",我和主人的亲密度是:"+this.love+".");
    }
}
