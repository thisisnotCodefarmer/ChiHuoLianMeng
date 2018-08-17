package wh.daywork.july.day15;

public class CalcUtil {
    public int num1;
    public int num2;

    public int plus(CalcUtil ca){
        return ca.num1+ca.num2;
    }

    public int sub(CalcUtil ca){
        return ca.num1-ca.num2;
    }

    public int mul(CalcUtil ca){
        return ca.num1*ca.num2;
    }

    public int div(CalcUtil ca){
        return ca.num1/ca.num2;
    }
}
