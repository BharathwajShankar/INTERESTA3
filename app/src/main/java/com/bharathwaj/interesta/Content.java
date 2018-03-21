package com.bharathwaj.interesta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Content extends Activity implements AdapterView.OnItemSelectedListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_content );

        // Spinner element
        final Spinner spinner = (Spinner) findViewById( R.id.spinner1 );
        Button button = (Button) findViewById( R.id.button1 );
        ImageButton img = findViewById( R.id.imageButton );
        ImageButton img1 = findViewById( R.id.imageButton2 );
        // Spinner click listener
        spinner.setOnItemSelectedListener( this );

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add( "NEWS" );
        categories.add( "EVENTS" );
        categories.add( "VIDEOS" );
        categories.add( "TUTORIALS" );

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item, categories );

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

        // attaching data adapter to spinner
        spinner.setAdapter( dataAdapter );
        Bundle bundle = getIntent().getExtras();
        final String data = bundle.get( "data" ).toString();
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Objects.equals( data, "Cricket" )) {
                    Intent intent = new Intent( Content.this, Cricket.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Football" )) {
                    Intent intent = new Intent( Content.this, Football.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Music" )) {
                    Intent intent = new Intent( Content.this, Music.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Doodling" )) {
                    Intent intent = new Intent( Content.this, Doodling.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Gaming" )) {
                    Intent intent = new Intent( Content.this, Gaming.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Photography" )) {
                    Intent intent = new Intent( Content.this, Photography.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Petcare" )) {
                    Intent intent = new Intent( Content.this, Petcare.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Reading" )) {
                    Intent intent = new Intent( Content.this, Reading.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Bodybuilding" )) {
                    Intent intent = new Intent( Content.this, Bodybuilding.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Driving" )) {
                    Intent intent = new Intent( Content.this, Driving.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Dance" )) {
                    Intent intent = new Intent( Content.this, Dance.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Horoscope" )) {
                    Intent intent = new Intent( Content.this, Horoscope.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Tourism" )) {
                    Intent intent = new Intent( Content.this, Tourism.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Food" )) {
                    Intent intent = new Intent( Content.this, Food.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Beauty" )) {
                    Intent intent = new Intent( Content.this, Beauty.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
                if (Objects.equals( data, "Unnamedmysteries" )) {
                    Intent intent = new Intent( Content.this, Unnamedmysteries.class );
                    intent.putExtra( "data1", String.valueOf( spinner.getSelectedItem() ) );
                    startActivity( intent );
                }
            }
        } );
        img.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Content.this,AddContents.class );
                startActivity( i );
            }
        } );

        img1.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent( Content.this,ChatActivity.class );
        startActivity( i );
    }
} );
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
