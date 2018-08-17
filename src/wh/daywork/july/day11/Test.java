package wh.daywork.july.day11;

public class Test{

    class Parent{
        protected void eat(){}
    }
    class  Child extends Parent{
         public  void eat(){}
    }


    public static String str="hello";

    private int add(int a,int b){
        return a+b;
    }
    private int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[]args){
       Test test=new Test();
       System.out.println(test.add(1,2)+test.add(3,4,5));
        System.out.println(Test.str);
    }
}

