package com.example.zhuda.roseandpeterhax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ChooseCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_country);



        String[] arraySpinner = new String[] {
                "Africa", "Asia", "Australia", "Europe", "North America", "South America"
        };

        final Spinner s = (Spinner) findViewById(R.id.continent);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);



        Intent intent = getIntent();
        final int type = intent.getIntExtra("type", 0);
        final String size = intent.getStringExtra("size");
        final String mat1 = intent.getStringExtra("mat1");
        final String mat2 = intent.getStringExtra("mat2");
        final String per1 = intent.getStringExtra("per1");
        final String per2 = intent.getStringExtra("per2");



        Button b = (Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String continent = s.getSelectedItem().toString();

                Intent intent = new Intent(ChooseCountry.this, DisplayResults.class);
                intent.putExtra("type", type);
                intent.putExtra("size", size);
                intent.putExtra("mat1", mat1);
                intent.putExtra("mat2", mat2);
                intent.putExtra("per1", per1);
                intent.putExtra("per2", per2);
                intent.putExtra("continent", continent);


                startActivity(intent);
            }
        });


    }
}
