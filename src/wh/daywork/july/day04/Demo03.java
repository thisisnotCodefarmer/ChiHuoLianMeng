package wh.daywork.july.day04;

public class Demo03 {
    public  static void main(String args[]){
        int i=0;
        while (i<9){
            i++;
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
