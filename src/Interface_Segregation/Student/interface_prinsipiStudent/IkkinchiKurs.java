package Interface_Segregation.Student.interface_prinsipiStudent;

public class IkkinchiKurs implements  Student,StudentSport,StudentBekorchi,StudentIshlash{
    @Override
    public void DarslarQilish() {
        System.out.println("Dars qilish");
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
