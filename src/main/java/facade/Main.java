package facade;

public class Main {
    public static void main(String[] args) {
        // Kullanıcı karmaşık sistemleri bilmiyor
        MediaFacade mediaFacade = new MediaFacade();

        // Sadece basit metotları çağırıyor
        mediaFacade.playMovie("video.mp4", "video.mp3", "video.srt");

        System.out.println("\n--- After a while ---\n");

        mediaFacade.stopMovie();
    }
}
