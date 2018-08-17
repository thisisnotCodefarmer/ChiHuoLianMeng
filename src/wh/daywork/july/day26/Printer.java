package wh.daywork.july.day26;

/**
*@Description: 墨盒接口
*/
interface InkBox{
    /**
     * @return 墨盒颜色
     *@Description: 得到墨盒颜色
    */
    public String getColor();
}
 /**
 *@Description: 纸张接口
 */
  interface Paper{
        /**
        *@Description: 得到纸张大小
         * @return： 纸张大小
        */
        public String getSize();
  }
  /**
  *@Description: 打印机类
  */
class Printer {
    InkBox inkBox;
    Paper paper;
    /**
    *@Description: 设置打印机墨盒
     * @param:inkBox 打印使用的墨盒
    */
    public void setInkBox(InkBox inkBox){
        this.inkBox=inkBox;
    }
    /**
    *@Description: 设置打印机纸张
     * @param：paper 设置打印机纸张
    */
    public void setPaper(Paper paper){
        this.paper=paper;
    }
    public void print(){
        System.out.println("使用"+inkBox.getColor()+"墨盒在"+paper.getSize()+"纸张上打印");
    }
}
/**
*@Description: 彩色墨盒
*/

class ColorInkBox implements InkBox{
        @Override
    public String getColor(){
            return  "彩色";
        }
    }

class  GrayInkBox implements InkBox{
    @Override
    public  String getColor(){
        return "黑白";
    }
}
/**
*@Description: A4纸张
*/
class A4Paper implements Paper{
    @Override
    public String getSize(){
        return "A4";
    }
}
/**
*@Description: B5纸张
*/
class B5Paper implements Paper{
    @Override
    public String getSize(){
        return "B5";
    }
}
class Test{
    public static void main(String[] args){
     InkBox inkBox=null;
     Paper paper=null;
     Printer printer=new Printer();

     inkBox=new GrayInkBox();
     paper=new A4Paper();
     printer.setInkBox(inkBox);
     printer.setPaper(paper);
     printer.print();


        inkBox=new ColorInkBox();
        paper=new B5Paper();
        printer.setInkBox(inkBox);
        printer.setPaper(paper);
        printer.print();


        paper=new A4Paper();
        printer.setPaper(paper);
        printer.print();
    }
}
