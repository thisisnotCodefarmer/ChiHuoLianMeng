package wh.daywork.july.day13;

class Student {


        public int id;
        public String name;
        public int age;
        public int score;

        public void showInfo(){
            System.out.println(id+"\t"+name+"\t"+age+"\t"+score);
        }
    }

    public class StudentBiz{
        Student[] students=new Student[30];
        /**

         * @Author: wangheng

         * @Date: 2018/7/26 8:56

         * @param

         * @Description:增加学生
         *

         */
        public void addStudent(Student stu){
            for (int i=0;i<students.length;i++){
                if(students[i]==null){
                    students[i]=stu;
                    break;
                }
            }
        }
        public void showStudents(){
            System.out.println("本班学生成绩列表：");
            for(int i=0;i<students.length;i++){
                if (students[i]!=null){
                    students[i].showInfo();
                }
            }
            System.out.println();
        }

}
