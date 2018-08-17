package wh.daywork.july.day17;

public class GetSum {
    public static int sumAdd(int[] scores){
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
        //返回总和
        sum=max+min;
        return sum;
    }
    public static void main(String[] args){
        int[] scores={11,12,13,15,23,45,56,76};
        sumAdd(scores);
    }
}
