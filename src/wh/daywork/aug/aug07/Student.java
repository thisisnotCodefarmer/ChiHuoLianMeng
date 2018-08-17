package wh.daywork.aug.aug07;

public class Student implements Comparable {
    String name;
    int  score;
    Student(String name,int score){
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Object b){
        Student student=(Student)b;
        int m=this.score-student.score;
        if (m==0) {
            return 1;
        }
        else {return m;}
    }

}

