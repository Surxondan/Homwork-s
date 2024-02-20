package Interface_Segregation.Student.I_prinsip_bulmaganda;

public class BirinchiKurs implements Student {
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

    }

    @Override
    public void Bekorchilik() {
        System.out.println("Dam olish");
    }
}
