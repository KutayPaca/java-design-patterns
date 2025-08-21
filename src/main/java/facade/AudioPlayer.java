package facade;

public class AudioPlayer {
    public void playAudio(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
    public void stopAudio() {
        System.out.println("Stopping audio file");
    }
}
