package com.example.lian.classshape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public final static String XRECT = "com.example.lian.classshape.XRECT";
    public final static String YRECT = "com.example.lian.classshape.YRECT";
    public final static String WIDTH = "com.example.lian.classshape.WIDTH";
    public final static String HEIGHT = "com.example.lian.classshape.HEIGHT";
    public final static String YCIRC = "com.example.lian.classshape.YCIRC";
    public final static String XCIRC = "com.example.lian.classshape.XCIRC";
    public final static String RADIUS = "com.example.lian.classshape.RADIUS";

    public static String[] colorsArray;

    private Spinner spin1;
    private Spinner spin2;
    

    public void onClick(View v) {
        Intent intent = new Intent(this, DisplayShapes.class);

        EditText editText = (EditText) findViewById(R.id.editText1);
        String xrect = editText.getText().toString();
        intent.putExtra(XRECT, xrect);

        editText = (EditText) findViewById(R.id.editText2);
        String yrect = editText.getText().toString();
        intent.putExtra(YRECT, yrect);

        editText = (EditText) findViewById(R.id.editText3);
        String width = editText.getText().toString();
        intent.putExtra(WIDTH, width);

        editText = (EditText) findViewById(R.id.editText4);
        String height = editText.getText().toString();
        intent.putExtra(HEIGHT, height);

        editText = (EditText) findViewById(R.id.editText5);
        String xcirc = editText.getText().toString();
        intent.putExtra(XCIRC, xcirc);

        editText = (EditText) findViewById(R.id.editText6);
        String ycirc = editText.getText().toString();
        intent.putExtra(YCIRC, ycirc);

        editText = (EditText) findViewById(R.id.editText7);
        String radius = editText.getText().toString();
        intent.putExtra(RADIUS, radius);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        spin1 = (Spinner)findViewById(R.id.spinner1);
        spin1.setOnItemSelectedListener(new SpinnerListener1());
        spin2 = (Spinner)findViewById(R.id.spinner2);
        spin2.setOnItemSelectedListener(new SpinnerListener2());

        colorsArray = getResources().getStringArray(R.array.colors);
        SpinnerListener1.selectedColor = colorsArray[0];
        SpinnerListener2.selectedColor = colorsArray[0];

        // adapter between colorsArray and the first spinner
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colorsArray);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(spinnerAdapter);
        //spin2.setAdapter(spinnerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
