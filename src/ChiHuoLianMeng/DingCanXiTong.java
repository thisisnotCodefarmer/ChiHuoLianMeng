package ChiHuoLianMeng;

import java.util.Scanner;

public class DingCanXiTong {
    private static void pln(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        //数据主体：一组订单信息
        String[] names = new String[4];      //保存订餐人姓名
        String[] dishMegs = new String[4];    //保存所选信息，包括菜品名和份数
        int[] times = new int[4];             //保存送餐时间
        String[] addresses = new String[4];   //保存送餐地址
        int[] states = new int[4];            //保存订单状态：0表示已预订，1表示已完成
        double[] sumPrices = new double[4];   //保存订单的总金额

        //创建三个数组储存三种菜品名称，单价和点赞数等信息
        //供选择的菜品信息
        String[] dishNames = {"红烧带鱼", "宫保鸡丁", "鱼香肉丝"};//菜品名
        double[] prices = new double[]{38.0, 20.0, 10.0};//菜品单价
        int[] praiseNums = new int[3];                //点赞数

        //初始化第一条订单信息
        names[0] = "张三";
        dishMegs[0] = "红烧带鱼 2份";
        times[0] = 12;
        addresses[0] = "天成路207号";
        sumPrices[0] = 76.0;
        states[0] = 1;

        //初始化第二条订单信息
        names[1] = "张三";
        dishMegs[1] = "宫保鸡丁 2份";
        times[1] = 18;
        addresses[1] = "天成路207号";
        sumPrices[1] = 45.0;
        states[1] = 0;


        Scanner input = new Scanner(System.in);
        int num = 0;  //输入0返回主菜单，否则退出系统
        boolean isExit = false;//ture 为退出系统
        pln("\n 欢迎使用“吃货联盟订餐系统”");
        // 循环：显示菜单，根据用户选择的数字执行相应功能
        //使用do-while循环
        do {
            //显示菜单
            pln("********************");
            pln("1.我要订餐");
            pln("2.查看餐袋");
            pln("3.签收订单");
            pln("4.删除订单");
            pln("5.我要点赞");
            pln("6.退出系统");
            pln("********************");
            pln("请选择：");
            int choose = input.nextInt();//记录用户选择的功能编号

            //根据用户输入的功能编号，执行相关功能
            switch (choose) {
                case 1:
                    //我要订餐
                    pln("******我要订餐******");
                    Boolean isAdd = false;//记录是否可以订餐
                    for (int j = 0; j < names.length; j++) {
                        if (names[j] == null) {//找到空位置 。可以添加订单信息
                            isAdd = true;//可以订餐
                            pln("请输入订餐人姓名：");
                            String name = input.next();
                            //显示供选择的菜品信息
                            pln("序号" + "\t" + "菜名" + "\t" + "单价" + "\t" + "点赞数");
                            for (int i = 0; i < dishNames.length; i++) {
                                String price = prices[i] + "元";
                                String priaiseNum = (praiseNums[i] > 0 ? praiseNums[i] + "赞" : "0");
                                pln((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
                            }
                            //用户点餐
                            pln("请选择你要点的菜品编号：");
                            int chooseDish = input.nextInt();
                            pln("请选择你需要的份数：");
                            int number = input.nextInt();
                            String dishMeg = dishNames[chooseDish - 1] + " " + number + "份";
                            double suumPrice = prices[chooseDish - 1] * number;
                            //餐费满50，免送餐费5元
                            double deliCharge = (suumPrice >= 50) ? 0 : 5;

                            pln("请输入送餐时间（送餐时间是10点知20点间整点送餐）：");
                            int time = input.nextInt();
                            while (time < 10 || time > 20) {
                                pln("您输入有误，请输入10-20间的整数");
                                time = input.nextInt();
                            }
                            pln("请输入送餐地址：");
                            String address = input.next();

                            //无需添加状态，默认是0，即已预订状态
                            pln("订餐成功");
                            pln("你定的是" + dishMeg);
                            pln("送餐时间" + time + "点");
                            pln("餐费：" + sumPrices + "元，送餐费" + deliCharge + "元，总计：" + (suumPrice + deliCharge) + "元。");

                            //添加数据
                            names[j] = name;
                            dishMegs[j] = dishMeg;
                            times[j] = time;
                            addresses[j] = address;
                            sumPrices[j] = suumPrice + deliCharge;
                            break;
                        }
                        if (!isAdd) {
                            pln("对不起，你的餐袋已满！");
                        }
                    }

                    break;
                case 2:
                    //查看餐袋
                    pln("******查看餐袋******");
                    pln("序号\t 订餐人\t 餐品信息\t \t送餐日期\t送餐地址\t\t总金额\t订单状态");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String state = (states[i] == 0) ? "已预订" : "已完成";
                            String date = times[i] + "日";
                            String sumPrice = sumPrices[i] + "元";
                            pln((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + date + "\t" + addresses[i] + "\t" + sumPrice + "\t" + state);
                        }
                    }
                    break;
                case 3:
                    //签收订单
                    pln("******签收订单******");
                    boolean isSignFind = false;//找到要签收的订单
                    pln("请选择要签收的订单序号：");
                    int signOrderId = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        //状态为已预定，序号为用户输入的订单序号减1：可签收
                        //状态为已完成，序号为用户输入的订单序号减1：不可签收
                        if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
                            states[i] = 1;//将状态值置为已完成
                            pln("订单签收成功！");
                            isSignFind = true;//标记已找到此订单
                        } else if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
                            System.out.println("您选择的订单已完成签收，不能再次签收！");
                            isSignFind = true;
                        }
                    }
                    //未找到的订单序号，不可签收
                    if (!isSignFind) {
                        System.out.println("您选择的订单不存在！");
                    }
                    break;
                case 4:
                    //删除订单
                    pln("******删除订单******");
                    boolean isDelFind = false;//标记是否找到要删除的订单
                    System.out.print("请输入要删除的订单序号");
                    int delId = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        //状态为已预定，序号为用户输入的订单序号减1：可删除
                        //状态为已完成，序号为用户输入的订单序号减1：不可签删除
                        if (names[i] != null && states[i] == 1 && delId == i + 1) {
                            isDelFind = true;
                            //执行删除操作，删除位置后元素依次前移
                            for (int j = delId - 1; j < names.length - 1; j++) {
                                names[j] = names[j + 1];
                                dishMegs[j] = dishMegs[j + 1];
                                times[j] = times[j + 1];
                                addresses[j] = addresses[j + 1];
                                states[j] = states[j];
                                sumPrices[j] = sumPrices[j + 1];
                            }
                            //最后一位清空
                            int endIndex = names.length - 1;
                            names[endIndex] = null;
                            dishMegs[endIndex] = null;
                            times[endIndex] = 0;
                            addresses[endIndex] = null;
                            states[endIndex] = 0;
                            sumPrices[endIndex] = 0;
                            System.out.println("删除订单成功！");
                            break;
                        } else if (names[i] != null && states[i] == 0) {
                            System.out.println("您选择的订单未签收，不能删除！");
                            isDelFind = true;
                            break;
                        }
                    }
                    if (!isDelFind) {
                        System.out.println("你要删除的订单不存在");
                    }

                    break;
                case 5:
                    //我要点赞
                    pln("******我要点赞******");
                    //显示菜品名
                    System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
                    for (int i = 0; i < dishNames.length; i++) {
                        String price = prices[i] + "元";
                        String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "赞" : "";
                        System.out.println((i + 1) + "\t" + dishMegs[i] + "\t" + price + "\t" + priaiseNum);
                    }
                    System.out.print("请选择你要点赞的菜品序号：");
                    int priaiseNum = input.nextInt();
                    praiseNums[priaiseNum - 1]++;
                    System.out.println("点赞成功！");

                    break;
                case 6:
                    //退出系统
                    isExit = true;
                    break;
                default:
                    isExit = true;
                    break;
            }

            if (!isExit) {
                pln("输入0返回");
                num = input.nextInt();
            } else {
                break;
            }
        } while (num == 0);
    }


}
