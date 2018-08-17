package wh.daywork.july.day17;

public class XiaoMing {
    String  name="小明";
    String school="合肥八中";
    int age=18;
    int custNo=006;
    String love="学习,看书，跑步，游戏";
    int yuWenScore=135;
    int shuXueScore=140;
    int yingYuScore=138;
    String birthday="2011年8月3日";

    public void show(){
        System.out.println("我叫"+name+",是"+school+"学生，"+"今年"+age+"岁,"+"我的爱好是："+love+",我上次语文成绩是："+yingYuScore+",我上次数学成绩是："+shuXueScore+",我上次英语成绩是："+yingYuScore);
    }
    public static void main(String[]args){
        XiaoMing xm=new XiaoMing();
        xm.show();
    }
}
