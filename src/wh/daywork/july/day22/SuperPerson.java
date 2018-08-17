package wh.daywork.july.day22;
/**

* @Description:    java类作用描述

* @Author:         wangheng

* @CreateDate:     2018/8/1 14:05

* @UpdateUser:     wangheng

* @UpdateDate:     2018/8/1 14:05

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
public class SuperPerson {
    class  Person{
        String name;
        public Person(){
            //super();//有没有都一样
            System.out.println("execute Person()");
        }
        public Person(String name){
            this.name=name;
            System.out.println("execute Person()");
        }
    }
    class Student extends Person {
        String school;

        public Student() {
            //super();//有没有都一样
            System.out.println("execute Student()");
        }

        public Student(String name, String school) {
            //显示调用了父类有参构造方法，将不执行无参构造方法
            super(name);
            this.school = school;
            System.out.println("sexcute Student(name,school)");
        }

        class PostGraduate extends Student {
            String guide;

            public PostGraduate() {
                //super();//有没有都一样
                System.out.println("execute PostGraduate()");
            }

            public PostGraduate(String name, String chool, String guide) {
                //super(name, school);
                this.guide = guide;
                System.out.println("execute Postgraduate（name,school,guide）");
            }

        }

        class TestTnherit {
            public  void main(String[] args) {
                    PostGraduate pgdt=null;
                    pgdt=new PostGraduate();
                    System.out.println();
                    pgdt=new PostGraduate("刘志同","北大","王老师");
            }

        }
    }

}
