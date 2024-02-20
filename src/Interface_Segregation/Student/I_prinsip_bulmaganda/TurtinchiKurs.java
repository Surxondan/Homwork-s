package Interface_Segregation.Student.I_prinsip_bulmaganda;

public class TurtinchiKurs implements Student {
    @Override
    public void DarslarQilish() {
        System.out.println("Dars qilish");
    }

    @Override
    public void AmaliyotQilish() {
        System.out.println("Amaliyot da ishlash");
    }

    @Override
    public void SportMash() {
        System.out.println("sport bilan shug`ullanish");
    }

    @Override
    public void Ishlash() {

    }

    @Override
    public void Bekorchilik() {

    }
}
