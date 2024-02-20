package Dependency_Inversion.playervideo;

public class VideoApp {
   private Video video;

    public VideoApp(Video video) {
        this.video = video;
    }
    public void palyvideo(String filename){
        video.play(filename);
    }

    public static void main(String[] args) {
        Video mp4video=new MP4Player();
        Video avivideo=new AviPlayer();

        VideoApp mp4app=new VideoApp(mp4video);
        mp4app.palyvideo("java dars.mp4");
        VideoApp aviapp=new VideoApp(avivideo);
        aviapp.palyvideo("o`tgankungi video.avi");

    }
}
