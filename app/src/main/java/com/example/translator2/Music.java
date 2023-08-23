package com.example.translator2;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;


public class Music extends Service {
    MediaPlayer mediaPlayer ;
    WordModel wordModel;
    public Music() {
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate(){
        mediaPlayer = MediaPlayer.create(this,wordModel.getMusic());
        mediaPlayer.setLooping(true);
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        mediaPlayer.start();
        return START_STICKY;
    }
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

}
