package wh.daywork.aug.aug01;

interface IFood{
    public void eat();
}

class Bread implements IFood{
    @Override
    public void eat(){
        System.out.println("吃面包");
    }
}
class Milk implements IFood{
    @Override
    public void eat(){
        System.out.println("喝牛奶");
    }
}
class Factory {
    public static IFood getInstance(String className) {
        if ("bread".equals(className)) {
            return new Bread();
        }
        else if ("milk".equals(className)) {
            return new Milk();
        }else {
            return null;
        }
    }
}
public class FactoryTest {
        public static void main(String[] args){
         IFood food=Factory.getInstance("milk");
         food.eat();
        }
}

