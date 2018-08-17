package wh.testwork01;


public class Test6 {
    public int count(int i) throws Exception {
        if (i == 0) {
            throw new Exception("Canshu");
        }
        return 20 / i;
    }
//    public void useCount(){
//        count(0);
//    }
    public void useCount() {
        try {
            count(0);
        }catch (Exception e){
        }
    }
}


