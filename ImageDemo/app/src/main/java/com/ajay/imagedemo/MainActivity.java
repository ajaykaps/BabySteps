package com.ajay.imagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void newPic (View view){

        Log.i("Info", "button Clicked");
        ImageView image = (ImageView) findViewById(R.id.image1);
        image.setImageResource(R.drawable.pexels);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
