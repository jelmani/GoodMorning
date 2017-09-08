package com.android.jeremyelmani.goodmorning;

import android.os.AsyncTask;
import android.util.Log;


/**
 * Created by jeremyelmani on 9/7/17.
 */

public class RetrieveTrack extends AsyncTask<Integer, Integer, Integer> {
    private static final String TAG = "RetrieveTrack";
    protected Integer doInBackground(Integer... request) {
        Integer thingy = new Integer(2);
        return thingy;
    }

    protected void onProgressUpdate(Integer... progress) {
        //setProgressPercent(progress[0]);
    }

    protected void onPostExecute(int track) {
        //showDialog("Downloaded " + result + " bytes");
    }
}
