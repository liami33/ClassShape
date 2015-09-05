package com.example.lian.classshape;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.FileNotFoundException;

public class DisplayShapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_shapes);
        float xrect;
        float yrect;
        float width;
        float height;
        float xcirc;
        float ycirc;
        float radius;


        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.XRECT);
        try {
            xrect = Float.parseFloat(message);
        }
        catch (Exception e) {
            xrect = 0;
        }


        message = intent.getStringExtra(MainActivity.YRECT);
        try {
            yrect = Float.parseFloat(message);
        }
        catch (Exception e) {
            yrect = 0;
        }


        message = intent.getStringExtra(MainActivity.WIDTH);
        try {
            width = Float.parseFloat(message);
        }
        catch (Exception e) {
            width = 0;
        }


        message = intent.getStringExtra(MainActivity.HEIGHT);
        try {
            height = Float.parseFloat(message);
        }
        catch (Exception e) {
            height = 0;
        }


        message = intent.getStringExtra(MainActivity.YCIRC);
        try {
            ycirc = Float.parseFloat(message);
        }
        catch (Exception e) {
            ycirc = 0;
        }


        message = intent.getStringExtra(MainActivity.XCIRC);
        try {
            xcirc = Float.parseFloat(message);
        }
        catch (Exception e) {
            xcirc = 0;
        }

        message = intent.getStringExtra(MainActivity.RADIUS);
        try {
            radius = Float.parseFloat(message);
        }
        catch (Exception e) {
            radius = 0;
        }

        MyShapeView shapes = new MyShapeView(this, xrect, yrect, width, height, xcirc, ycirc, radius, Color.MAGENTA, Color.GREEN);
        setContentView(shapes);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_shapes, menu);
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
