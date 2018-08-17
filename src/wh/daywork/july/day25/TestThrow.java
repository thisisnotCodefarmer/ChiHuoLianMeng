package wh.daywork.july.day25;

public class TestThrow {
    private String name="";
    private int age=0;
    private String sex="男";
    /**
    * @Description: 设置性别
    * @Param:  sex 性别
     * @throws Exception
    * @return:
    * @Author: Mr.Wang
    * @Date: 2018/8/6
    */
    public void setSex(String sex) throws Exception{
        if("男".equals(sex)||"女".equals(sex)) {
            this.sex = sex;
        }
        else {
            throw new Exception("性别必须是\'男\'或者\'女\'!");
        }
    }
    /**
    *@Description:  输出基本信息
    */
    public void print(){
        System.out.println(this.name+"("+this.sex+","+this.age+"岁)");
    }
    public static void main(String[] args){
     TestThrow tt=new TestThrow();
     try{
         tt.setSex("Male");
         tt.print();
     }catch (Exception e){
         e.printStackTrace();
     }
    }
}
