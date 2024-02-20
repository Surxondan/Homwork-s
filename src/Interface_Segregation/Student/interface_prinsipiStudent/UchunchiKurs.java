package Interface_Segregation.Student.interface_prinsipiStudent;

public class UchunchiKurs implements Student,StudentPiractice,StudentIshlash{
    @Override
    public void DarslarQilish() {
        System.out.println("Dars qilish");
    }

    @Override
    public void AmaliyotQilish() {
        System.out.println("Amaliyotga borish");
    }



    @Override
    public void Ishlash() {
        System.out.println("ishga chiqish");
    }


}
