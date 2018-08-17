package wh.daywork.aug.aug08;

public class sbAppend {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("青春无悔");
		System.out.println(stringBuffer);

		StringBuffer stringBuffer1 = stringBuffer.append("我心永恒");
		System.out.println(stringBuffer1);

		StringBuffer stringBuffer2 = stringBuffer1.append('a');
		System.out.println(stringBuffer2);

        int num = 10;
		StringBuffer stringBuffer3 = stringBuffer2.append(num);
		System.out.println(stringBuffer3);

		StringBuffer stringBuffer4 = stringBuffer3.reverse();
		System.out.println(stringBuffer4);

		String s = stringBuffer4.toString();
		System.out.println(s);

	}
}
