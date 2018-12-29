package com.ajay.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void testNumber (View view){

        String message="";

        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);
        
        if (usersNumber.getText().toString().isEmpty()){

            message = "Please Enter a number";

            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            
        } else {

        Log.i("usersNumber", usersNumber.getText().toString());

        class NumberCheck{

            int num ;

            public boolean isTriangular() {

                int sum = 0;

                for (int n = 1; sum <= num; n++) {

                    sum = sum + n;

                    if (sum == num){
                        return true;
                    }
                }
                return false;
            }


            public boolean isSquare() {

                int x = (int) Math.sqrt(num);

                if(Math.pow(x,2) == num) {
                    return true;
                } else {
                    return false;
                }

            }

        }

        NumberCheck input = new NumberCheck();

        input.num = Integer.parseInt(usersNumber.getText().toString());

        if (input.isTriangular() && input.isSquare()){

            message = input.num + " is both Triangular and Square Number";
        } else if (input.isTriangular()){
            message = input.num + " is a Triangular Number";
        } else if (input.isSquare()){
            message = input.num + " is a Square Number";
        } else{
              message = input.num + " is neither a Triangular  nor a Square ";

        }
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

     }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
