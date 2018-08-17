package wh.daywork.july.day11;

public class Administrator {
    String name;
    int password;
    public void show(){
        System.out.println("姓名+"+name+"\t密码："+password);
    }
    public static  void main(String[]args){
        Administrator administrator=new Administrator();
        administrator.name="张三";
        administrator.password=123456;
        administrator.show();
    }
}
