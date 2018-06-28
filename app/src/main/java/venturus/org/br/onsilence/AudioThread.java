package venturus.org.br.onsilence;

import android.content.Context;
import android.media.AudioManager;

public class AudioThread extends Thread {

    private boolean running = true;

    private AudioManager audioManager;
    public AudioThread(String name, Context context) {
        super(name);
        audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
    }

    private void abaixarVolume() {
        while (running) {
            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 0, 0);
        }
    }

    @Override
    public void run() {
        abaixarVolume();
    }

    public void parar() {
        running = false;
    }
}
