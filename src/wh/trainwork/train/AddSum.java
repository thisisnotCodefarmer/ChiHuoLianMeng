package wh.trainwork.train;

public class AddSum {
	public static void main(String[] args) {

		int sum = 0;
		for (int num = 1; num <= 100; num = num + 2) {
			sum = sum + num;
		}
		System.out.println("1到100奇数之和为：" + sum);
	}
}
