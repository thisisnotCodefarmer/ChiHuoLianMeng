package wh.daywork.aug.aug05;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map countries = new HashMap();
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚合众国");

		String country=(String)countries.get("CN");
        System.out.println("CN--->"+country);

        System.out.println("Map中有"+countries.size()+"国家");

        //两次判断是否存在“FR”键
        System.out.println("FR?"+countries.containsKey("FR"));
        countries.remove("FR");
        System.out.println("FR?"+countries.containsKey("FR"));

        //显示键集，值集，键-值对集
        System.out.println(countries.keySet());

        System.out.println(countries.values());

        System.out.println(countries);

        //清空HashMap并判断
        countries.clear();
        if(countries.isEmpty())
            System.out.println("已清空Map中数据！");
	}
}
