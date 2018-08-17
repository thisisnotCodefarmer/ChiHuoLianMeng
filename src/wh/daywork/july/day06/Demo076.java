package wh.daywork.july.day06;

public class Demo076 {
    public static  void main(String[]args){
        int k=10;
        int j=0;
        for (int i=9;i>0;--i){
            if (i%3==0){
                k--;
                continue;
            }
            j++;
        }
        System.out.println(k+","+j);
    }
}
