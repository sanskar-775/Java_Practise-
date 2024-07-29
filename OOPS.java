public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(4);
        System.out.println(p1.getTip());
        
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        // BankAcc myAcc = new BankAcc();
        // myAcc.Username="Sanskar Sharma";
        // myAcc.setpass("BABA");
    }
}
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
}  
class BankAcc{
    String Username;
    //private String pasword;
    public void setpass(String pwd){
        //pasword=pwd;
    }
}