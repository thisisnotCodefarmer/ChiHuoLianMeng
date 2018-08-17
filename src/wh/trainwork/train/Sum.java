package wh.trainwork.train;

public class Sum {
    public static  void main (String[]args){
        int sum=0,i;
        for(i=1;i<=4;i++){
            switch(1){
                case 1:
                    sum=sum+2;
                case 2:
                    sum=sum+4;
                case 3:
                    sum=sum+16;
                    break;
            }

        }
        System.out.println(sum);
    }
}
