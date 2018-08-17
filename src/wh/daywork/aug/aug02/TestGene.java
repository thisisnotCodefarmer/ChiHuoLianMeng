package wh.daywork.aug.aug02;

abstract class AbsAnimal<S>{
      private S num;
      private S name;
    public AbsAnimal(){

    }
    public AbsAnimal(S num, S name) {
        this.num = num;
        this.name = name;
    }

    public S getNum() {
        return this.num;
    }

    public void setNum(S num) {
        this.num = num;
    }

    public S getName() {
        return this.name;
    }

    public void setName(S name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbsAnimal{" +
                "num=" + num +
                ", name=" + name +
                '}';
    }

    public void run(){};
}
class Dog<S> extends AbsAnimal{

    @Override
    public void run(){
        System.out.println("我是"+super.getName()+"会跑");
    }

}
public class TestGene {
    public static void main(String[] args){
      AbsAnimal<String> absAnimal=new Dog<String>();
      absAnimal.run();


    }
}
