package wh.daywork.july.day13;

public class Number {

    public int plus(int num1,int num2){
        return num1=num2;

    }
    public int plus(Calc calc){
        return calc.num1+calc.num2;
    }

    public int plus(int[] arr){
        int result=0;
        for (int num:arr) {
            result+=num;
        }
        return result;
    }

}
