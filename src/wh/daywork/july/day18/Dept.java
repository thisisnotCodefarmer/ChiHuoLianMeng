package wh.daywork.july.day18;

class Dept {

    private String  dname;//部门名称
    private int  deptno;//部门编号
    private String loc;//部门地址
    public Dept(){

    }
    public Dept(String dname,int deptno,String loc){
        this.dname=dname;
        this.deptno=deptno;
        this.loc=loc;
    }

    public void setDname(){
        this.dname=dname;
    }

    public void setDeptno(){
        this.deptno=deptno;
    }
    public void setLoc(){
        this.loc=loc;
    }

    public String getDname(){
        return dname;
    }
    public int getDeptno(){

        return deptno;
    }
    public String getLoc(){
        return loc;
    }
    public String showInfo(){
        return "部门名称:"+this.dname+"\\部门编号:"+this.deptno+"\\部门地址:"+this.loc;
    }

    public static void main(String[]args){
        Dept dept=new Dept("财务部",1234,"123号");
        System.out.println(dept.showInfo());
    }
}
