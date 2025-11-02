package lsp;

public class Main {
    public static void main(String[] args) {
        WhatsApp wa = new WhatsApp();
        Instragram ig = new Instragram();

        wa.chat();
        ig.chat();
        wa.sendPhotosAndVideos();
        ig.sendPhotosAndVideos();
        wa.callGroupVideo();
        ig.publishPost();
    }
}
