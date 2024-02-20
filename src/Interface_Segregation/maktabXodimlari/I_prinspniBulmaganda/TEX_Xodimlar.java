package Interface_Segregation.maktabXodimlari.I_prinspniBulmaganda;

public class TEX_Xodimlar implements Malumoti {
    @Override
    public void urtaMaxsus() {
        System.out.println("Farqi yuq");
    }

    @Override
    public void oliy() {

    }

    @Override
    public void tugalanmaganOliy() {

    }

    @Override
    public void urta() {
        System.out.println("urta  buladi");
    }
}
