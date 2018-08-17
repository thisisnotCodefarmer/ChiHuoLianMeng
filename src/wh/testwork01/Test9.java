package wh.testwork01;

public class Test9 {
    public static void main(String[] args){
        String s1=new String("abc");
        StringBuffer s2=new StringBuffer("abc");
        s2.append(s1);
       s1=s2.toString();
        s1.concat("abc");
        System.out.println(s1);
    }
}
class Demo{
    public void showFavor(StringBuffer thing){
        System.out.println(thing);
    }
    public static void main(String[] args){
//        StringBuffer maFavor="足球";
//        showFavor(StringBuffer myFavor);
    }
}