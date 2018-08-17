package wh.daywork.july.day23;


import java.util.Scanner;

/**
*@Description: 宠物类，狗狗和企鹅的父亲
*/
 public abstract class PetPoly {
    protected String name = "无名氏";
    protected int health = 100;
    protected int love = 0;

    PetPoly(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    /**
     * @Description: 输出宠物信息
     */
    public void print() {
        System.out.println("宠物的自白：\n我的名字叫"
                + this.name + ",我的健康值是：" + this.health
                + ",我和主人的亲密度是:" + this.love + ".");
    }

    /**
     * @Description: 抽象方法 eat（），负责宠物吃饭功能
     */
    public abstract void eat();
}

    /**
    *@Description: 狗狗，宠物的子类
    */
  class DogPoly extends PetPoly {
        private String strain;

        public DogPoly(String name, String strain) {
            super(name);
            this.strain = strain;
        }

        /**
         * @Description: 重写父类的print（）方法
         */
        @Override
        public void print() {
            super.print();
            System.out.println("我是一只" + this.strain + ".");
        }
        /**
        *@Description: 实现狗狗吃饭的方法
        */
        @Override
        public void eat(){
            super.health=super.health+3;
            System.out.println("狗狗"+super.name+"吃饱啦！健康值增加3");
        }
        /**
        *@Description: 实现接飞盘功能 
        */
        public void catchingFlyDisc(){
            
        }
    }
    
    /**
    *@Description: 企鹅类，宠物的子类
    */
  class PenguinPoly extends PetPoly{
        private String sex;
        public PenguinPoly(String name,String sex){
            super(name);
            this.sex=sex;
        }
        /**
        *@Description: 重写父类的print（）方法
        */
        @Override
        public void print(){
            super.print();
            System.out.println("性别是"+this.sex+".");
        }
        /**
        *@Description: 实现企鹅吃饭的方法
        */
        @Override
        public void eat(){
            super.health+=5;
            System.out.println("企鹅"+super.name+"吃饱啦！健康值增加5");
        }
    }
    
    /**
    *@Description: 猫类，宠物的子类 
    */
    class CatPoly extends PetPoly{
      private String color;
      public CatPoly(String name,String color){
          super(name);
          this.color=color;
      }
      /**
      *@Description: 实现吃饭方法 
      */
      @Override
      public void eat(){
          super.health+=4;
          System.out.println("猫咪"+super.name+"吃饱啦！健康值增加4");
      }
    }
    
    /**
    *@Description: 主人类 
    */
 class Master{
        private String name="";
        private int money=0;
        public Master(String name,int money){
            this.name=name;
            this.money=money;
        }
        
        /**
        *@Description: 主人给宠物喂食 （多态）
        */
        public void feed(PetPoly pet){
            pet.eat();
        }

        /**
        *@Description: 主人给Dog喂食
        */
//        public void feed(DogPoly dog){
//            dog.eat();
//        }
        /**
        *@Description: 主人给penguin喂食
        */
//        public void feed(PenguinPoly penguin){
//            penguin.eat();
//        }
        /**
        * @Description: 主人领养宠物
        * @Param:  id 宠物类型编号
        * @return:  宠物
        * @Author: Mr.Wang
        * @Date: 2018/8/3
        */
        public PetPoly getPet(int typeId){
            PetPoly pet=null;
            if (typeId==1){
                pet=new DogPoly("oo","雪纳瑞");
            }else  if(typeId==2){
                pet=new PenguinPoly("11","Q妹");
            }
            return pet;
        }
}

/**
*@Description: 测试类
*/
class Test{
      public static void main(String[] args){
                Master master=new Master("王先生",100);

          //     DogPoly dog=new DogPoly("欧欧","雪纳瑞");
          //     PenguinPoly penguin=new PenguinPoly("楠楠","q妹");
          //     master.feed(dog);
          //     master.feed(penguin);

            //         PetPoly pet=new DogPoly("欧欧","雪纳瑞");
            //          PetPoly pet=new PenguinPoly("楠楠","q妹");
            //         master.feed(pet);

//            PetPoly pet=new CatPoly("粒粒","黄色");
//            master.feed(pet);

          Scanner in=new Scanner(System.in);
          System.out.println("欢迎来到宠物店");
          System.out.println("请选择要领养的宠物：1、狗狗 2、企鹅");

          int typeId=in.nextInt();
          PetPoly pet=master.getPet(typeId);
          if (pet!=null){
              System.out.println("领养成功！");
              master.feed(pet);
          }else {
              System.out.println("对不起，没有此类型的宠物，领养失败");
          }
      }
}