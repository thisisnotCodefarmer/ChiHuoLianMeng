package wh.daywork.july.day08;

public class Demo058 {
    public static void main(String[]args){
        int count=0;
        double[]arr={36,25,77.5,88};

            for (int i=0;i<arr.length-1;i++){
                if (arr[i]%2==0)
                    count++;
            }
            System.out.println(count);

    }
}
