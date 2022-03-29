package com.example.multy_treading;


import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class MyAsyncTask extends AsyncTask<Void, Void, String> {

    private WeakReference<TextView> mTextView;

    @Override
    protected String doInBackground(Void... voids) {
        return null;
    }
}
