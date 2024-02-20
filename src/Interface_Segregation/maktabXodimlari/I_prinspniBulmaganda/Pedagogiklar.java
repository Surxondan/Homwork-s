package Interface_Segregation.maktabXodimlari.I_prinspniBulmaganda;

public class Pedagogiklar implements Malumoti {
    @Override
    public void urtaMaxsus() {
        System.out.println("satajga qarab");
    }

    @Override
    public void oliy() {
        System.out.println("Oliy bulish");
    }

    @Override
    public void tugalanmaganOliy() {
        System.out.println("3 va 4 kurslar ");
    }

    @Override
    public void urta() {

    }
}
