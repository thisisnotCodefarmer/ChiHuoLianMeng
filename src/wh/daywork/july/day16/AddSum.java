package wh.daywork.july.day16;

public class AddSum {
    public int sumAdd(int[] scores){
       int sum=0;
        //求最高分
        int max=scores[0];
            for (int i=1;i<scores.length;i++){
                if(max<scores[i]){
                    max=scores[i];
                }
            }

        //求最低分
        int min=scores[0];
            for (int i=1;i<scores.length;i++) {
                if (min > scores[i]) {
                    min = scores[i];
                }
            }

        sum=max+min;
        return sum;
    }
}
