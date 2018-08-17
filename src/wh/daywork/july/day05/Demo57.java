package wh.daywork.july.day05;

public class Demo57 {
    public static void main(String args[]){
        int money=52;//我的存款 ，单位万元
        if(money>500){
            System.out.println("太好了，我可以买一两凯迪拉克");
        }else if(money>=100){
            System.out.println("不错，我可以买一辆帕萨特");
        }else if(money>50){
            System.out.println("我可以买辆伊兰特");
        }else if(money>=10){
            System.out.println("至少我可以买一辆奥拓");
        }else{
            System.out.println("看来 我只能买一辆捷安特了");
        }

    }
}
