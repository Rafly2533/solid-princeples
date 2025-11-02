package lsp;

public class WhatsApp implements VideoGroupManager{
    @Override
    public void chat() {
        System.out.println("Mengirim pesan melalui WhatsApp");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Mengirim foto dan video melalui WhatsApp");
    }

    @Override
    public void callGroupVideo() {
        System.out.println("Melakukan panggilan video grup melalui WhatsApp");
    }
}
