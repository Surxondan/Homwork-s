package Interface_Segregation.Student.I_prinsip_bulmaganda;

public class UchunchiKurs implements Student {
    @Override
    public void DarslarQilish() {
        System.out.println("Dars qilish");
    }

    @Override
    public void AmaliyotQilish() {
        System.out.println("Amaliyotga borish");
    }

    @Override
    public void SportMash() {

    }

    @Override
    public void Ishlash() {
        System.out.println("ishga chiqish");
    }

    @Override
    public void Bekorchilik() {

    }
}
