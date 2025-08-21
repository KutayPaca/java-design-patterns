package facade;

public class VideoPlayer {
    public void playVideo(String fileName) {
        System.out.println("Playing video:  " + fileName);
    }
    public void stopVideo() {
        System.out.println("Stopping video");
    }
}
