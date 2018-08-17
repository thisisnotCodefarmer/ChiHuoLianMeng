package wh.testwork01;

public class Test3 {
    public static void main(String[] args){
        System.out.println(npe());
    }

    private static int npe() {
        try{
            String a=null;
            String b=new String(a);
        }catch (Exception e){
            System.out.println("a");
            return 1;
        }finally{
            System.out.println("b");
        }
        return 2;
    }
}
