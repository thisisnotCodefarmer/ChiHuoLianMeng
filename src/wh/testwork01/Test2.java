package wh.testwork01;

public class Test2 {

    public static void func() throws Exception{
        try{
            throw  new Exception();
    }finally {
            System.out.println("B");
        }
    }
    public static void main(String[]args){
        try {
            func();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }
}

