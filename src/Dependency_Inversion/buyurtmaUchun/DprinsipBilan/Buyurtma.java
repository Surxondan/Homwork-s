package Dependency_Inversion.buyurtmaUchun.DprinsipBilan;

public class Buyurtma {
   Tulov tulov;

    public Buyurtma(Tulov tulov) {
        this.tulov = tulov;
    }
   public void tulovniTasdiqlash(Double miqtor){
        tulov.TulovAmalgaOshirish(miqtor);
    }

    public static void main(String[] args) {
        Tulov naqttulov=new NaqtTulov();
        Tulov onlinetulovtulov=new Onlinetulov();
        // endi Buyurtma obektni online va naqt tulovlarni sinaymiz
        Buyurtma buyurtma=new Buyurtma(onlinetulovtulov);
        buyurtma.tulovniTasdiqlash(1_500_456.0);
        Buyurtma buyurtma1=new Buyurtma(naqttulov);
        buyurtma1.tulovniTasdiqlash(1_600_000.0);
    }
}
