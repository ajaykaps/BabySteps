package com.ajay.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertAmount (View view){

        Log.i("Info","Clicked Convert");
        EditText editText = (EditText) findViewById(R.id.editText);
        Double amount = Double.parseDouble(editText.getText().toString());
        amount = amount * 73.38;
        String amountString =  String.format("₹%.2f", amount);
        Toast.makeText(MainActivity.this, amountString, Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
