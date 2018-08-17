package wh.daywork.july.day07;

public class Demo047 {
    public static void main(String[] args) {

        int a_Length = 10;

//二维数组定义 面向对象语言 数组定义必须指定长度 但是往往不想这么做 js一个优点 是实现 数组长度 动态增加。

        String[][] a = new String[a_Length][];

        for(int i=0; i<a_Length; i++){
            a[i] =  new String[i+1];
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){

//赋值  这里是 锯齿形 二维数组 所以赋值需要加1 程序运行就可以看出效果

                a[i][j] = ((j+1)+" * "+(i+1)+" = ")+((i+1)*(j+1));
            }
        }

        for(int i=0; i<a.length; i++){

            for(int j=0; j<a[i].length; j++){
                if(j == 0){
                    System.out.print(a[i][j]);
                }else{
                    System.out.print("  "+a[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
}

