package com.ajay.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomnum;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guessNumber (View view){

        Log.i("Info","Clicked Guess");
        EditText editText = (EditText) findViewById(R.id.editText2);

        int guessInt = Integer.parseInt(editText.getText().toString());


        if ( guessInt <  randomnum ) {

            makeToast("Higher!");

        } else if ( guessInt > randomnum ){

            makeToast("Lower!");
            }

         else {

            makeToast("That's Right!!! Try Again!");

                Random rand = new Random() ;

                randomnum = rand.nextInt(30) + 1;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random() ;
        randomnum = rand.nextInt(30) + 1;
    }
}
