package com.bharathwaj.interesta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Information extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Spinner element
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Button button=(Button)findViewById(R.id.button);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> interests = new ArrayList<String>();
        interests.add("Cricket");
        interests.add("Football");
        interests.add("Music");
        interests.add("Doodling");
        interests.add("Gaming");
        interests.add("Photography");
        interests.add("Petcare");
        interests.add("Reading");
        interests.add("Bodybuilding");
        interests.add("Driving");
        interests.add("Dance");
        interests.add("Horoscope");
        interests.add("Tourism");
        interests.add("Food");
        interests.add("Beauty");
        interests.add("Unnamedmysteries");



        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, interests);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Information.this,Content.class);
                intent.putExtra("data", String.valueOf(spinner.getSelectedItem()));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}
