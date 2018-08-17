package wh.daywork.july.day14;

public class TestSort {
    public static void main(String[]args){
        CustomerBiz  cu=new CustomerBiz();
        String[] namebysort=new String[]{"Tom","Jack","Merry","Smith","Sunny"};
        System.out.println("*****排序前*****");
        for (int i=0;i<namebysort.length;i++){
            if (namebysort[i]!=null){
                System.out.println(namebysort[i]+"\t");
            }
        }
        //调用排序方法
        cu.sortNames(namebysort);

        System.out.println("*****排序后*****");
        for (int i=0;i<namebysort.length;i++){
            if (namebysort[i]!=null){
                System.out.println(namebysort[i]+"\t");
            }
        }
    }
}
