package lsp;

public class Instragram implements PostMediaManager {
    @Override
    public void publishPost() {
        System.out.println("Mempublikasikan postingan di Instagram");
    }

    @Override
    public void chat() {
        System.out.println("Mengirim pesan melalui Instagram");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Mengirim foto dan video melalui Instagram");
    }
}
