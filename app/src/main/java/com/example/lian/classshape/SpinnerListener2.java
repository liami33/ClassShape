package com.example.lian.classshape;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Lian on 10/09/2015.
 */
public class SpinnerListener2 implements AdapterView.OnItemSelectedListener {

    public static String selectedColor;

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        selectedColor = parent.getItemAtPosition(position).toString();
    }


    public void onNothingSelected(AdapterView<?> arg0) {
        // do nothing!

    }
}
