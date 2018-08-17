package wh.daywork.july.day08;

public class Demo048 {
    public static  void main(String[]args){

      char c[]={'1','2','3','4'};
      for (int i=0;i<c.length/2;i++){
          char d=c[i];
          c[i]=c[c.length-(i+1)];
          c[c.length-(i+1)]=d;
      }
      for (int i=0;i<c.length;i++){
          System.out.print(c[i]);
      }
    }
}
