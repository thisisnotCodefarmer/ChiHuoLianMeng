package wh.daywork.aug.aug03;

interface  IFight{
    public void fight();
}
/**
*@Description: 激光类
*/
class Laser implements IFight{
    @Override
    public void fight() {
        System.out.println("use laser fighting ");
    }
}
/**
*@Description: 炸弹类
*/
class Bomb implements IFight{
    @Override
    public void fight() {
        System.out.println("use bomb fighting");
    }
}
class Call implements IFight{
    @Override
    public void fight() {
        System.out.println("call others fighting");
    }
}

class AronMan{
    public void fight(IFight iFight){
        iFight.fight();
    }

    public IFight getIFight(String type){
        switch(type){
            case "Hulk":
                return new Bomb();
            case "Thor":
                return new Laser();
            case "Thanos":
                return new Call();
                default:
                    return null;
        }
    }
}
class Test{
    public static void main(String[] args){
        AronMan aronMan=new AronMan();
        IFight iFight=aronMan.getIFight("Thanos");
        IFight call=new Call();
        aronMan.fight(call);
    }
}
