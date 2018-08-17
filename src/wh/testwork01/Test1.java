package wh.testwork01;

public class Test1 {
    public static void main(String[] args){
        try{
            throw new NullPointerException();
        }catch (Exception e){
            System.out.println("123");
        }
    }
}
