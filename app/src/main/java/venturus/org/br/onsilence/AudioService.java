package venturus.org.br.onsilence;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

public class AudioService extends IntentService {

    private AudioManager audioManager;

    public AudioService() {
        super("AudioService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        while (true) {
            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 0, 0);
        }
    }
}
