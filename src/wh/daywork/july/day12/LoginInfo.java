package wh.daywork.july.day12;

import java.util.Scanner;

/**

 * @Author: wangheng

 * @Date: 2018/7/24 17:30

 * @param

 * @Description:
 * 1任务
 *     1三个账号（用户名，密码，账号类型）通过控制台输入来创建对象
 *     2把三个账号保存到数组中，再从控制台输入账号，和数组中的账号进行对比，判断是否拥有此用户
 *
 */
public class LoginInfo {
    String username;
    String password;
    int type;

    public  void view(){
        String info="username="+username+",password"+password+",type"+type;
        System.out.println(info);
    }
    public static   void show() {
        //在数组中储存3种类型的用户
        //管理员是wangheng  操作员是 lance  VIP用户是paomian
        LoginInfo[] usersArray = new LoginInfo[3];


        Scanner input = new Scanner(System.in);
        //创建3个对象
        LoginInfo wangheng = new LoginInfo();
        System.out.println("请输入用户类型：");
        wangheng.type = input.nextInt();
        System.out.println("请输入用户名");
        wangheng.username = input.next();
        System.out.println("请输入密码");
        wangheng.password = input.next();

        LoginInfo lance = new LoginInfo();
        System.out.println("请输入用户类型：");
        lance.type = input.nextInt();
        System.out.println("请输入用户名");
        lance.username = input.next();
        System.out.println("请输入密码");
        lance.password = input.next();


        LoginInfo paomian = new LoginInfo();
        System.out.println("请输入用户类型：");
        paomian.type = input.nextInt();
        System.out.println("请输入用户名");
        paomian.username = input.next();
        System.out.println("请输入密码");
        paomian.password = input.next();

        LoginInfo[] userArray = {wangheng, lance, paomian};

        for (int i = 0; i < userArray.length; i++) {
            userArray[i].view();
        }


            System.out.println("请输入用户名");
            String username = input.next();
            System.out.println("请输入密码");
            String password = input.next();

            if (wangheng.username.equals(username) && wangheng.password.equals(password)) {
                System.out.println("已匹配到该用户");
            } else if (lance.username.equals(username) && lance.password.equals(password)) {
                System.out.println("已匹配到该用户");
            } else if (paomian.username.equals(username) && paomian.password.equals(password)) {
                System.out.println("已匹配到该用户");
            } else {
                System.out.println("无该用户信息！");
            }


    }
   public static void main(String[]args){

        show();
   }
}
