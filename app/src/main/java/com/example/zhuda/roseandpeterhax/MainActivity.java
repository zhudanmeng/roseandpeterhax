package com.example.zhuda.roseandpeterhax;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate and perform click event on buttons
        ImageButton tshirt = (ImageButton)findViewById(R.id.tshirt);
        tshirt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 1);
                startActivity(intent);
                //startActivity(new Intent(MainActivity.this, ChooseSize.class));
            }
        });


    }



}
