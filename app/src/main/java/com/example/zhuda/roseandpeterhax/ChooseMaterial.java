package com.example.zhuda.roseandpeterhax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ChooseMaterial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_material);


        String[] arraySpinner = new String[] {
               "None", "Cotton", "2", "3", "4", "5", "6", "7"
        };

        final Spinner s = (Spinner) findViewById(R.id.mat1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        final Spinner s2 = (Spinner) findViewById(R.id.mat2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);

        final EditText e = (EditText)findViewById(R.id.percentageMat1);
        final EditText e2 = (EditText)findViewById(R.id.percentageMat2);

        Intent intent = getIntent();
        final int type = intent.getIntExtra("type", 0);
        final String size = intent.getStringExtra("size");

        Toast.makeText(getApplicationContext(),"The type is: " + type + " The size is: " + size,Toast.LENGTH_SHORT).show();




        Button b = (Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String mat1 = s.getSelectedItem().toString();
                String mat2 = s2.getSelectedItem().toString();
                String per1 = e.getText().toString();
                String per2 = e2.getText().toString();

                Intent intent = new Intent(ChooseMaterial.this, DisplayResults.class);
                intent.putExtra("type", type);
                intent.putExtra("size", size);
                intent.putExtra("mat1", mat1);
                intent.putExtra("mat2", mat2);
                intent.putExtra("per1", per1);
                intent.putExtra("per2", per2);


                startActivity(intent);
            }
        });
    }
}
