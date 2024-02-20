package Interface_Segregation.maktabXodimlari.IprinsipBilan;

public class Pedagogiklar implements Malumoti,TugallanmaganOliy {


    @Override
    public void oliy() {
        System.out.println("Oliy bulish");
    }

    @Override
    public void tugalanmaganOliy() {
        System.out.println("3 va 4 kurslar ");
    }

}
