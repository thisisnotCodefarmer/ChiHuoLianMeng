package wh.daywork.july.day11;

public class Teacher {
    String name;
    String major;
    String courses;
    int schoolAge;
    public void show(){
        System.out.println(name+major+courses+schoolAge);
    }

    public static void main(String[]args){
        Teacher teacher=new Teacher();
        teacher.name="王老师";
        teacher.major="计算机";
        teacher.courses="java";
        teacher.schoolAge=5;
        teacher.show();
    }
}
