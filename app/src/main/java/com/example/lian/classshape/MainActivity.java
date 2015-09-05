package com.example.lian.classshape;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String XRECT = "com.example.lian.classshape.XRECT";
    public final static String YRECT = "com.example.lian.classshape.YRECT";
    public final static String WIDTH = "com.example.lian.classshape.WIDTH";
    public final static String HEIGHT = "com.example.lian.classshape.HEIGHT";
    public final static String YCIRC = "com.example.lian.classshape.YCIRC";
    public final static String XCIRC = "com.example.lian.classshape.XCIRC";
    public final static String RADIUS = "com.example.lian.classshape.RADIUS";
    

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
//
//        MyShapeView myShape = new MyShapeView(this, 400, 900, 200, Color.GREEN);
//        myShape.setColorRect(Color.CYAN);
//        Log.i("The number behind CYAN:", Integer.toString(Color.CYAN));
//        myShape.setxRect(100);
//        myShape.setyRect(100);
//        myShape.mySetHeight(300);
//        myShape.mySetWidth(600);
//
//        setContentView(myShape);
//        {
//            myShape.onDraw(canvas);
//        }


        // create a blue rectangle, with width=10 and length=20
        //MyShape rectangle = new MyShape("Rectangle", "Blue", 20, 10);
        // Integer.toString() is a wrapper to use integer methods
        //Log.i(Integer.toString(rectangle.getWidth()), "");

        // create a default circle - color=red, radius=20
        //MyShape circle = new MyShape();
        //circle.draw();
        //Log.i(Integer.toString(circle.getRadius()), "");


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
