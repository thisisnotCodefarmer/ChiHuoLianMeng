package wh.daywork.july.day22;

/**

* @Description:    java类作用描述

* @Author:         wangheng

* @CreateDate:     2018/8/2 8:55

* @UpdateUser:     wangheng

* @UpdateDate:     2018/8/2 8:55

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
public class Test {
  /**
  *@Description: 宠物抽象类，狗狗与企鹅的父亲
  */
     abstract class Pet{
        private String name="无名氏";
        private int health=100;
        private int love=0;

        /**
        * @Description: 有参构造方法
        * @Param:  name 昵称
        * @return:
        * @Author: Mr.Wang
        * @Date: 2018/8/2
        */
        public Pet(String name){
            this.name=name;
        }
        public void setName(){
            this.name=name;
        }
        public String getName(String name){
            return this.name;
        }
      public void setHealth(){
          this.health=health;
      }
      public int getHealth(int health){
          return this.health;
      }
      public void setLove(){
          this.love =love;
      }
      public int getLove(int love){
          return this.love;
      }


    abstract void print();

  }
    public static void main(String[] args){

    }
}
