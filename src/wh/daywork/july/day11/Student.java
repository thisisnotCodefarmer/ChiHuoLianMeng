package wh.daywork.july.day11;

public class Student {
    String name;

    public void show(){
        System.out.println(name);
    }

    public static void main(String[]args){
            Student student=new Student();
            student.name="张浩";
            student.show();
    }
}
