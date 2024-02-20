package Interface_Segregation.Student.interface_prinsipiStudent;

public class TurtinchiKurs implements Student,StudentPiractice,StudentSport{
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



}
