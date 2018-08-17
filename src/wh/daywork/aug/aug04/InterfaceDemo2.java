package wh.daywork.aug.aug04;

abstract class Water {
    public abstract void getWater();
}
interface filter {
      void filter();
}
interface buffer {
     void buffer();

}
interface warm {
    void warm();
}

interface sugar {
     void sugar();
}

class  PurifiedWater extends Water implements filter,buffer,warm,sugar{
    @Override
    public void getWater() {
        System.out.println("进行取水");
    }
    @Override
    public void filter() {
            System.out.println("将水进行过滤");
        }
    @Override
    public void buffer() {
            System.out.println("将水进行缓冲");
    }
    @Override
    public void warm() {
            System.out.println("将水进行加热");
        }

        @Override
        public void sugar () {
                System.out.println("在水里加糖");
            }
}

class InterfaceDemo02{
    public static void main(String[] args){
     PurifiedWater purifiedwater=new PurifiedWater();

     purifiedwater.getWater();
     purifiedwater.filter();
     purifiedwater.buffer();
     purifiedwater.warm();
     purifiedwater.sugar();
    }
}




