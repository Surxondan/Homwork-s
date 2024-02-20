package Single_Responsibility.xodimlar.kalkulyator;

public class Main {
    public static void main(String[] args) {


        Hisoblash hisoblash = new Hisoblash();
        int sum = hisoblash.qushish(2001, 2024);
        int ayirish = hisoblash.ayrish(2024, 2001);
        long karrakarra = hisoblash.kupaytirsh(2, 2024);
        int bulish = hisoblash.bulish(20000000, 5);
        //int bulish1 = hisoblash.bulish(20000000, 0);


        ChiqarishEkranga natijasi = new ChiqarishEkranga();
        natijasi.natijaekran(sum);
        natijasi.natijaekran(ayirish);
        natijasi.natijaekran(karrakarra);
        natijasi.natijaekran(bulish);
       // natijasi.natijaekran(bulish1);
    }
}
