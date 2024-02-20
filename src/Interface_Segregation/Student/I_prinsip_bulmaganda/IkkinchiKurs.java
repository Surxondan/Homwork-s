package Interface_Segregation.Student.I_prinsip_bulmaganda;

public class IkkinchiKurs implements Student {
    @Override
    public void DarslarQilish() {
        System.out.println("Dars qilish");
    }

    @Override
    public void AmaliyotQilish() {

    }

    @Override
    public void SportMash() {
        System.out.println("Sport bilan shug`ulanish");
    }

    @Override
    public void Ishlash() {
        System.out.println("Ishga chiqish");
    }

    @Override
    public void Bekorchilik() {
        System.out.println("Dam olish");
    }
}
