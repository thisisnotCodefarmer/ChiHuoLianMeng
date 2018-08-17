package wh.daywork.aug.aug02;

class Point <T>{
    private T x;
    private T y;

    public T getX() {
        return this.x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return this.y;
    }

    public void setY(T y) {
        this.y = y;
    }
}

public class TestGenericity {
    public static void main(String[] args){
        Point<Integer> point=new Point<Integer>();
        point.setX(20);
        point.setY(10);
        int x=point.getX();
        int y=point.getY();
        System.out.println("X坐标："+x+"Y坐标："+y);
    }
}
