package com.example.lian.classshape;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyShapeView myShape = new MyShapeView(this, 400, 900, 200, Color.GREEN);
        myShape.setColorRect(Color.CYAN);
        Log.i("The number behind CYAN:", Integer.toString(Color.CYAN));
        myShape.setxRect(100);
        myShape.setyRect(100);
        myShape.mySetHeight(300);
        myShape.mySetWidth(600);

        setContentView(myShape);
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
