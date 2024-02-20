package Dependency_Inversion.buyurtmaUchun.DprinsipBilan;

public class Onlinetulov implements  Tulov{
    @Override
    public void TulovAmalgaOshirish(double miqdor) {
        System.out.println("Uzum bank Kartasidan "+miqdor+" so`m  to`lov amolga oshirildi..");
    }
}
