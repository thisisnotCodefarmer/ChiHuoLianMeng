package wh.daywork.july.day22;

/**

* @Description:    java类作用描述

* @Author:         wangheng

* @CreateDate:     2018/8/1 10:31

* @UpdateUser:     wangheng

* @UpdateDate:

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
public class Person {
    private String name;
    private int  age ;
    private final int MAX_NAMENUM=6;
    private final int MIN_NAMENUM=2;
    private final int MAX_AGENUM=100;
    private final int MIN_AGENUM=0;

    public void setName(String name){
        if(name.length()>MAX_NAMENUM||name.length()<MIN_NAMENUM){
            System.out.println("您设置的人名不符合要求！");
            return;
        }
        else {
            this.name=name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int  age){
        if(age>MAX_AGENUM||age<MIN_AGENUM){
            System.out.println("您设置的年龄不合法！");
            return;
        }
        else {
            this.age=age;
        }
    }
    public int getAge(){
        return this.age;
    }

public static void main(String[]args){
        Person p=new Person();
        p.age=1000;
        p.setAge(1000);
        System.out.println("未能设置age的成员变量时："+p.getAge());
}
}
