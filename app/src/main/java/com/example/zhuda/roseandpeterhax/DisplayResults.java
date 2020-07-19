package com.example.zhuda.roseandpeterhax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DisplayResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);



        Intent intent = getIntent();
        final int type = intent.getIntExtra("type", 0);
        final String size = intent.getStringExtra("size");
        final String mat1 = intent.getStringExtra("mat1");
        final String mat2 = intent.getStringExtra("mat2");
        final String per1 = intent.getStringExtra("per1");
        final String per2 = intent.getStringExtra("per2");

        Toast.makeText(getApplicationContext(),"The type is: " + type + " The size is: " +
                size + ", " + mat1 + ": " + per1 + ", " + mat2 +": " + per2 ,Toast.LENGTH_SHORT).show();


    }
}
