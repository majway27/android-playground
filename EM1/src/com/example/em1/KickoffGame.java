package com.example.em1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class KickoffGame extends Activity {

    //how long until we go to the next activity
    protected int _kickoffTime = 10000; 

    private Thread kickoffThread;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cutscreen_kickoffgame);

        final KickoffGame kickoffScreen = this; 

        // thread for displaying the kickoffScreen
        kickoffThread = new Thread() {
			@Override
            public void run() {
                try {
                    synchronized(this){

                            //wait 10 sec
                            wait(_kickoffTime);
                    }

                } catch(InterruptedException e) {}
                finally {
                    finish();

                    //start a new activity
                    Intent i = new Intent();
                    i.setClass(kickoffScreen, EncryptedMemoriesI.class);
                            startActivity(i);
                    finish();
                }
            }
        };

        kickoffThread.start();
    }

    //Function that will handle the touch
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            synchronized(kickoffThread){
                    kickoffThread.notifyAll();
            }
        }
        return true;
    }

}