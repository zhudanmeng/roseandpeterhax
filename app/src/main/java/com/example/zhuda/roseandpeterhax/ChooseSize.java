package com.example.zhuda.roseandpeterhax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class ChooseSize extends AppCompatActivity {

    private Spinner spinnerRee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_size);

        spinnerRee = findViewById(R.id.spinnerRee);

        String[] clothingSizes = getResources().getStringArray(R.array.Sizes);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, clothingSizes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRee.setAdapter(adapter);

        Intent intent = getIntent();
        final int type = intent.getIntExtra("type", 0);


        Button b = (Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String size = spinnerRee.getSelectedItem().toString();

                Intent intent = new Intent(ChooseSize.this, ChooseMaterial.class);
                intent.putExtra("type", type);
                intent.putExtra("size", size);
                startActivity(intent);
            }
        });



    }


}
