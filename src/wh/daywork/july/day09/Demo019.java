package wh.daywork.july.day09;

public class Demo019 {
    public static void main(String[]args){

      int[]arr =new int[]{8,2,1,0,3};
      int[] index=new int[]{2,0,3,2,4,0,1,3,2,3,3};
      String tel="";
      for(int i:index){
          tel+=arr[i];
      }
      System.out.println(tel);
    }
}

