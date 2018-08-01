package errordemo;

public class ErrorDemo1 {
    public  static void main(String[]args){
        int [] scores=new int[]{90,85,65,89,87};
        System.out.println("第三位同学的成绩应修改为92");
        scores[3]=92;
        System.out.println("修改后，第五位同学成绩是：");
        for(int i=0;i<=scores.length;i++){
            System.out.println(scores[i]+"");
        }
    }
}
