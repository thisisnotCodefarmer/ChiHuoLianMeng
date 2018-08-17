package wh.daywork.july.day05;

public class Demo63 {
    public static void main(String[]args){
        for (int i=0;i<6;i++){
            for (int j=0;j<6;){
                if (i+j>7){
                    System.out.print(i+j);
                    break;
                }
            }
        }
    }
}
