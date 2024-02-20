package Interface_Segregation.Student.interface_prinsipiStudent;

public class BirinchiKurs implements Student,StudentBekorchi,StudentSport{
    @Override
    public void DarslarQilish() {
        System.out.println("Dars qilish");
    }



    @Override
    public void SportMash() {
        System.out.println("Sport bilan shug`ulanish");
    }



    @Override
    public void Bekorchilik() {
        System.out.println("Dam olish");
    }
}
