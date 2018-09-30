package com.ajay.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickMe (View view){

        EditText nameText = findViewById(R.id.nameText);
        Log.i("Info", nameText.getText().toString());
        Toast.makeText(MainActivity.this, "Hi there, " + nameText.getText(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
