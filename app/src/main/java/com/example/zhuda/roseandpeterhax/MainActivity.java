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
            }
        });

        ImageButton sweater = (ImageButton)findViewById(R.id.sweater);
        sweater.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 2);
                startActivity(intent);
            }
        });

        ImageButton jeans = (ImageButton)findViewById(R.id.jeans);
        jeans.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 3);
                startActivity(intent);
            }
        });

        ImageButton pants = (ImageButton)findViewById(R.id.pants);
        pants.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 4);
                startActivity(intent);
            }
        });


        ImageButton shorts = (ImageButton)findViewById(R.id.shorts);
        shorts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 5);
                startActivity(intent);
            }
        });


        ImageButton dress = (ImageButton)findViewById(R.id.dress);
        dress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 6);
                startActivity(intent);
            }
        });

        ImageButton jacket = (ImageButton)findViewById(R.id.jacket);
        jacket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 7);
                startActivity(intent);
            }
        });

        ImageButton suit = (ImageButton)findViewById(R.id.suit);
        suit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseSize.class);
                intent.putExtra("type", 8);
                startActivity(intent);
            }
        });

    }



}
