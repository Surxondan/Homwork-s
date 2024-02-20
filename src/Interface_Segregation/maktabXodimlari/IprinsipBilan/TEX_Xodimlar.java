package Interface_Segregation.maktabXodimlari.IprinsipBilan;

import Interface_Segregation.maktabXodimlari.I_prinspniBulmaganda.Malumoti;

public class TEX_Xodimlar implements UrtaM {
    @Override
    public void urtaMaxsus() {
        System.out.println("Buladi");
    }
        @Override
    public void urta() {
        System.out.println("urta  buladi");
    }
}
