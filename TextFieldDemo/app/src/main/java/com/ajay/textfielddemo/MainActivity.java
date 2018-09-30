package com.ajay.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void submitData(View view){

        EditText userName = (EditText)  findViewById(R.id.userName);
        EditText password = (EditText)  findViewById(R.id.password);
        Log.i("User ID", userName.getText().toString());
        Log.i("Password", password.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
