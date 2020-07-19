package com.example.zhuda.roseandpeterhax;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
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
        final String continent = intent.getStringExtra("continent");

        System.out.println(per1 +", " +per2);
        //region BioD
        TextView bioDLow = (TextView) findViewById(R.id.bioDLow);
        TextView bioDMedium = (TextView) findViewById(R.id.bioDMedium);
        TextView bioDHigh = (TextView) findViewById(R.id.bioDHigh);
        double percent1;
        double percent2;


        try {
            percent1 = Double.parseDouble(per1)/100;
        }

        catch (Exception e){
            percent1 = 0;
        }

        try {
            percent2 = Double.parseDouble(per2)/100;
        }

        catch (Exception e){
            percent2 = 0;
        }




        //Calculating biodegradability of material 1
        double mat1BioD = 0;
        double mat1Carbon = 0;
        double mat1Water = 460;

        if (mat1.equals("Nylon")){
            mat1BioD = percent1;
            mat1Carbon = 37 *percent1;
            mat1Water = 150 * percent1;
        }

        else if (mat1.equals("Acrylic")){
            mat1BioD = percent1;
            mat1Carbon = 26 * percent1;
            mat1Water = 210 * percent1;
        }

        else if (mat1.equals("Polyester" )) {
            mat1BioD = percent1;
            mat1Carbon = 19 * percent1;
            mat1Water = 17 * percent1;
        }

        else if (mat1.equals("Polypropylene")) {
            mat1BioD = percent1;
            mat1Carbon = 17 * percent1;
            mat1Water = 29 * percent1;
        }

        else if (mat1.equals("Viscose")) {
            mat1BioD = percent1;
            mat1Carbon = 15 * percent1;
            mat1Water = 3000 * percent1;
        }


        else if (mat1.equals("Wool")) {
            mat1BioD = 10* percent1;
            mat1Carbon = 7 * percent1;
            mat1Water = 460 * percent1;

        }

        else if (mat1.equals("Cotton")) {
            mat1BioD = 11 * percent1;
            mat1Carbon = 8 * percent1;
            mat1Water = 10000 * percent1;
        }

        else if (mat1.equals("Hemp")) {
            mat1BioD = 12 * percent1;
            mat1Carbon = 3 * percent1;
            mat1Water = 500 * percent1;
        }


        //Calculating biodegradability of material 2
        double mat2BioD = 0;
        double mat2Carbon = 0;
        double mat2Water = 460;

        if (mat2.equals("Nylon")){
            mat2BioD = percent2;
            mat2Carbon = 37 *percent2;
            mat2Water = 150 * percent2;
        }

        else if (mat2.equals("Acrylic")){
            mat2BioD = percent2;
            mat2Carbon = 26 * percent2;
            mat2Water = 210 * percent2;
        }

        else if (mat2.equals("Polyester" )) {
            mat2BioD = percent2;
            mat2Carbon = 19 * percent2;
            mat2Water = 17 * percent2;
        }

        else if (mat2.equals("Polypropylene")) {
            mat2BioD = percent2;
            mat2Carbon = 17 * percent2;
            mat2Water = 29 * percent2;
        }

        else if (mat2.equals("Viscose")) {
            mat2BioD = percent2;
            mat2Carbon = 15 * percent2;
            mat2Water = 3000 * percent2;
        }


        else if (mat2.equals("Wool")) {
            mat2BioD = 10* percent2;
            mat2Carbon = 7 * percent2;
            mat2Water = 460 * percent2;

        }

        else if (mat2.equals("Cotton")) {
            mat2BioD = 11 * percent2;
            mat2Carbon = 8 * percent2;
            mat2Water = 10000 * percent2;
        }

        else if (mat2.equals("Hemp")) {
            mat2BioD = 12 * percent2;
            mat2Carbon = 3 * percent2;
            mat2Water = 500 * percent2;
        }

        if (mat1BioD + mat2BioD <= 4){
            bioDLow.setTextColor(Color.RED);
            bioDLow.setTypeface(null, Typeface.BOLD);
        }
        else  if (mat1BioD + mat2BioD > 4 && mat1BioD + mat2BioD <= 8){
            bioDMedium.setTextColor(Color.YELLOW);
            bioDMedium.setTypeface(null, Typeface.BOLD);
        }
        else if (mat1BioD + mat2BioD > 8){
            bioDHigh.setTextColor(Color.GREEN);
            bioDHigh.setTypeface(null, Typeface.BOLD);
        }
        //endregion


        //region CO2
        TextView CarbonLow = (TextView) findViewById(R.id.CarbonLow);
        TextView CarbonMedium = (TextView) findViewById(R.id.CarbonMedium);
        TextView CarbonHigh = (TextView) findViewById(R.id.CarbonHigh);

        //calculate weight in kg
        double weight = 0;

        if (type == 1) {
            weight = 0.18;
        }
        else  if (type == 2) {
            weight = 0.4;
        }
        else  if (type == 3) {
            weight = 0.4;
        }
        else  if (type == 4) {
            weight = 0.35;
        }
        else  if (type == 5) {
            weight = 0.23;
        }
        else  if (type == 6) {
            weight = 0.3;
        }
        else  if (type == 7) {
            weight = 0.8;
        }
        else  if (type == 8) {
            weight = 0.32;
        }

        //shipping
        double shipping = 0;
        if (continent.equals("Asia")){
            shipping = 9.6;
        }
        else  if (continent.equals("South America")){
            shipping = 5.8;
        }
        else  if (continent.equals("Australia")){
            shipping = 12.8;
        }
        else  if (continent.equals("Europe")){
            shipping = 5.5;
        }
        else  if (continent.equals("Africa")){
            shipping = 6.5;
        }
        else if (continent.equals("North America")){
            shipping = 2.1;
        }

        //weight of item (mat1carbon  + mat2carbon) + weight of item (shipping)

        double carbon = weight * (mat1Carbon + mat2Carbon + shipping);


        if (carbon <= 6){
            CarbonLow.setTextColor(Color.GREEN);
            CarbonLow.setTypeface(null, Typeface.BOLD);
        }
        else  if (carbon <= 12){
            CarbonMedium.setTextColor(Color.YELLOW);
            CarbonMedium.setTypeface(null, Typeface.BOLD);
        }
        else {
            CarbonHigh.setTextColor(Color.RED);
            CarbonHigh.setTypeface(null, Typeface.BOLD);
        }
        //endregion


        //region Water
        TextView WaterLow = (TextView) findViewById(R.id.waterLow);
        TextView WaterMedium = (TextView) findViewById(R.id.waterMedium);
        TextView WaterHigh = (TextView) findViewById(R.id.waterHigh);


        //weight of item (mat1water  + mat2water)
        double water  = weight * (mat1Water + mat2Water);

        if (water <= 100){
            WaterLow.setTextColor(Color.GREEN);
            WaterLow.setTypeface(null, Typeface.BOLD);
        }
        else  if (water <= 200){
            WaterMedium.setTextColor(Color.YELLOW);
            WaterMedium.setTypeface(null, Typeface.BOLD);
        }
        else {
            WaterHigh.setTextColor(Color.RED);
            WaterHigh.setTypeface(null, Typeface.BOLD);
        }



        //endregion

        TextView textLabel = (TextView) findViewById(R.id.textLabel);
        textLabel.setText("Creating your piece of clothing uses as much water as the average adult" +
                " drinks in " + (mat1Water + mat2Water)/1000 +" years!");



        Button b = (Button) findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayResults.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
