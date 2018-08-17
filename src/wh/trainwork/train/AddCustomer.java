package wh.trainwork.train;

import java.util.Scanner;

public class AddCustomer {
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
		int custNo = 0;
		String birthday;
		int point = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入会员号(<4位整数>)");
			custNo = input.nextInt();
			System.out.print("请输入会员生日(月/日<用两位整数>)");
			birthday = input.next();
			System.out.print("请输入会员积分\n");
			point = input.nextInt();
			if (custNo < 1000 || custNo > 9999) {
				System.out.println("客户号" + custNo + "是无效会员号！");
				System.out.println("录入信息失败\n");
				continue;
			}
			System.out.println("您录入的会员信息是：");
			System.out.println(custNo + "" + birthday + "" + point + "\n");

		}
		System.out.println("程序结束!");
	}
}
