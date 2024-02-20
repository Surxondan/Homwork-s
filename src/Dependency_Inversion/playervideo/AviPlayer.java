package Dependency_Inversion.playervideo;

public class AviPlayer implements Video{

    @Override
    public void play(String filename) {
        System.out.println("Avi videoni ochyapman \n"+filename);
    }
}
