package wh.daywork.july.day28;


interface IPet{
    public String getName();
    public String getColor();
    public int getAge();
}
class Cat implements IPet{
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog implements IPet{
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class PetShop {
    //保存多个属性
    private IPet[] pets;
    //数据保存的位置
    private int foot;

    public PetShop(int len) {
        if (len > 0) {
            this.pets = new IPet[len];
        } else {
            this.pets = new IPet[1];
        }
    }

    public boolean add(IPet ipet) {
        if (this.foot < this.pets.length) {
            this.pets[this.foot] = ipet;
            this.foot++;
            return true;
        } else {
            return false;
        }
    }

    public IPet[] search(String keyWord) {
        IPet[] iPets = null;
        int count = 0;
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] != null) {
                if (this.pets[i].getName().indexOf(keyWord) != -1
                        || this.pets[i].getColor().indexOf(keyWord) != -1) {
                    count++;
                }
            }
        }
        iPets = new IPet[count];
        int f = 0;
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] != null) {
                if (this.pets[i].getName().indexOf(keyWord) != -1
                        || this.pets[i].getColor().indexOf(keyWord) != -1) {
                    iPets[f] = this.pets[i];
                    f++;
                }
            }
        }
        return iPets;
    }
}
    class PetShopDemo{
        public static void main(String[] args){
            PetShop ps=new PetShop(5);
            ps.add(new Cat("白猫","白色",2));
            ps.add(new Cat("黑猫","黑色",2));
            ps.add(new Cat("花猫","花色",2));
            ps.add(new Dog("拉布拉多","黄色",2));
            ps.add(new Dog("金毛","金色",2));
            ps.add(new Dog("黄狗","黄色",2));
            print(ps.search("黑"));
        }
        public static void print(IPet[] iPets){
            for (int i=0;i<iPets.length;i++){
                if(iPets[i]!=null){
                    System.out.println(iPets[i].getName()+
                            ","+iPets[i].getColor()+
                            ","+iPets[i].getAge());
                }
            }
        }
    }

