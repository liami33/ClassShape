package com.example.lian.classshape;

import android.content.Context;
import android.view.View;

/**
 * Created by Lian on 29/08/2015.
 */
public class MyShape extends View {
    private String shapeType;
    private String color;
    private int radius;
    private int height;
    private int width;


    public void draw() {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

//    public int getWidth() {
//        return width;
//    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShapeType() {
        return shapeType;
    }

//    public int getHeight() {
//        return height;
//    }

    public void setHeight(int lenghth) {
        this.height = height;
    }


//    public MyShape() {
//        this.shapeType = "Circle";
//        this.color = "red";
//        this.radius = 20;
//    }
//
//    public MyShape(String s, String c, int h, int w) {
//        this.shapeType = s;
//        this.color = c;
//        this.height = h;
//        this.width = w;
//    }
//

    public MyShape(Context c) {
        super(c);

    }
}




