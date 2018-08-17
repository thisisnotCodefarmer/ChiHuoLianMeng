package wh.daywork.july.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**

 * @Author: wangheng

 * @Date: 2018/7/31 19:02

 * @param

 * @Description:
 * 围棋

 *

 */
public class Gobang {
    //定义棋盘的大小
    /**

     * @Author: wangheng

     * @Date: 2018/7/31 19:46

     * @param  BOARD_SIZE

     * @Description:

     *

     */
    private static int BOARD_SIZE=15;
    //定义一个二位数组来充当棋盘
    /**

     * @Author: wangheng

     * @Date: 2018/7/31 19:47

     * @param board

     * @Description:

     *

     */
    private String[][] board;

    public void initBoard() {
        //初始化棋盘数组
        board = new String[BOARD_SIZE][BOARD_SIZE];
        //把每个元素赋值为"＋"，画出棋盘
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "＋";
            }
        }
    }

    /**

     * @Author: wangheng

     * @Date: 2018/7/31 19:47

     * @param

     * @Description: 在控制台输出棋盘的方法

     *

     */
        public void printBoard(){
            //打印每个数组元素
            for (int i=0;i<BOARD_SIZE;i++){
              for (int j=0;j<BOARD_SIZE;j++){
                  //不换行打印
                  System.out.print(board[i][j]);
            }
            //换行
            System.out.println();
        }
    }
    public static void  main(String[]args) throws Exception{
        Gobang gb=new Gobang();
        gb.initBoard();
        gb.printBoard();

        //☆☆☆获取键盘输入的方法
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String inputStr=null;
        //br.readLine()   每当键盘输入一行内容后回车，刚输入的的内容被br读取到
        while ((inputStr=br.readLine())!=null){
                String[] posStrArr=inputStr.split(",");
                int xPos=Integer.parseInt(posStrArr[0]);
                int yPos=Integer.parseInt(posStrArr[1]);

                gb.board[yPos-1][xPos-1]="○";

                gb.printBoard();
                System.out.println("请输入你下棋的坐标，应以是，y的格式：");

        }
    }

}
