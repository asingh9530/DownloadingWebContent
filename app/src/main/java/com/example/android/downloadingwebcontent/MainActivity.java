package com.example.android.downloadingwebcontent;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    public class Download extends AsyncTask<String, Void ,String >{


        @Override
        protected String doInBackground(String... params) {
            Log.i("URl",params[0]);

            return "Done";
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Download task = new Download();
        try {
            String result= task.execute("https://www.ecowebhosting.co.uk/","http://www.stackoverflow.com").get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
