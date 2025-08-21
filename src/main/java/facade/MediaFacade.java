package facade;

public class MediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private SubtitleManager subtitleManager;

    public MediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.subtitleManager = new SubtitleManager();
    }

    // Tek bir metotla film açma
    public void playMovie(String videoFile, String audioFile, String subtitleFile) {
        System.out.println("The video is starting...\n");
        videoPlayer.playVideo(videoFile);
        audioPlayer.playAudio(audioFile);
        subtitleManager.loadSubtitle(subtitleFile);
        System.out.println("\n The video is playing...");
    }

    // Bu metodun adı stopMovie olmalı ki Main.java çalışsın
    public void stopMovie() {
        System.out.println("\nStopping video...\n");
        videoPlayer.stopVideo();
        audioPlayer.stopAudio();
        subtitleManager.disableSubtitle();
        System.out.println("✅ The video has been stopped.");
    }
}
