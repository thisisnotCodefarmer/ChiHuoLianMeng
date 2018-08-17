package wh.daywork.aug.aug08;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){
        Random rand=new Random();
        for (int i=0;i<20;i++){
            int num=rand.nextInt(10);
            System.out.println("第"+(i+1)+"个随机数："+num);
        }
    }
}
