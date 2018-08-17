package wh.daywork.july.day07;

public class Demo037 {
    public static void main(String[] args) {
        //先创建一个二维 数组
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
        }
        // 2.显示的为二维数组的每个元素赋值
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                yangHui[i][0] = yangHui[i][i] = 1;
                if (i < 1 && j > 0 && j < i) {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }
        }

        // 遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();

        }

    }
}

