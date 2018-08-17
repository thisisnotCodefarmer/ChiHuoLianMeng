package wh.daywork.july.day13;

public class TestInfo {
    public static void main(String[]args){
        Student student1=new Student();
        student1.id=10;
        student1.name="qwe";
        student1.age=18;
        student1.score=100;
        Student student2=new Student();
        student2.id=12;
        student2.name="asd";
        student2.age=15;
        student2.score=70;

        StudentBiz studentBiz=new StudentBiz();
        studentBiz.addStudent(student1);
        studentBiz.addStudent(student2);
        studentBiz.showStudents();
    }
}
