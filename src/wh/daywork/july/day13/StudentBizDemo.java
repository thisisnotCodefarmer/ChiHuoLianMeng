package wh.daywork.july.day13;

public class StudentBizDemo {
    //求平均分
    public double calAvg(int [] scores){
        int sum=0;
        double avg=0.0;
        for (int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        avg=(double)sum/scores.length;
        return avg;
    }

    //求最高分
    public int getMax(int[] scores){
        int max=scores[0];
       for (int i=1;i<scores.length;i++){
           if(max<scores[i]){
               max=scores[i];
           }
       }
       return max;
    }
    //求最低分
    public int getMin(int[] scores){
        int min=scores[0];
        for (int i=1;i<scores.length;i++){
            if(min>scores[i]){
                min=scores[i];
            }
        }
        return min;
    }
}
