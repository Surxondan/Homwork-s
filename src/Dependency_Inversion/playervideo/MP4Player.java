package Dependency_Inversion.playervideo;

   public class  MP4Player implements Video{

        @Override
        public void play(String filename) {
            System.out.println(" Mp4 videoni ochyapman     \n" +filename);
        }
    }


