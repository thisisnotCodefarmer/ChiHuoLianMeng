package wh.daywork.july.day21;

public class TestDog {
    /**
     * @Description: 宠物狗狗类，使用权限修饰符 private和protected 进行封装
     */
    class Dog {
        private String name = "无名氏";
        private int health = 0;
        private int love = 0;
        private String strain = "聪明的拉布拉多犬";


        public Dog() {
        }

        public Dog(String name, String strain) {
            this.name = name;
            this.strain = strain;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName(String name) {
            return this.name;
        }

        public void setStrain(String strain) {
            this.name = name;
        }

        public String getStrain(String strain) {
            return this.name;
        }

        //重写equals()方法 ，如果狗狗的姓名 品种相同 ，则认为是同一只狗狗
        //instance操作符用于判断一个引用类型 所引用的对象是否是一个类的实现


        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Dog)) {
                return false;
            }
            Dog obj = (Dog) o;
            if (this.name == obj.name && this.strain.equals(obj.strain)) {
                return true;
            } else {
                return false;
            }
        }


        public void main(String[] args) {
            //Dog没有重写equals（）时 ，下列代码结果为：false；重写后：结果为：true
            Dog dog1 = new Dog("多多", "拉布拉多");
            Dog dog2 = new Dog("多多", "拉布拉多");
            System.out.println(dog1.equals(dog2));
        }

    }
}