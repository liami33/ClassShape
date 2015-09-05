package com.example.lian.classshape;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Lian on 02/09/2015.
 */
public class MyShapeView extends View {

    private Paint paint = new Paint();

    private float xRect;
    private float yRect;
    private float width;
    private float height;
    private float xCirc;
    private float yCirc;
    private float radius;
    private int colorRect;
    private int colorCirc;

    //constructor for RECTANGLES
    public MyShapeView(Context c) {
       super(c);
    }

    // constructor for CIRCLES
    public MyShapeView(Context c,float xr, float yr, float w, float h, float xc, float yc, float r, int colorRect, int colorCirc) {
        super(c);
        this.xRect = xr;
        this.yRect = yr;
        this.width = w;
        this.height = h;
        this.xCirc = xc;
        this.yCirc = yc;
        this.radius = r;
        this.colorRect = colorRect;
        this.colorCirc = colorCirc;

    }

    public float myGetWidth() {
        return width;
    }

    public void mySetWidth(float width) {
        this.width = width;
    }

    public float myGetHeight() {
        return height;
    }

    public void mySetHeight(float height) {
        this.height = height;
    }

    public float getxRect() {
        return xRect;
    }

    public void setxRect(float xRect) {
        this.xRect = xRect;
    }

    public float getyRect() {
        return yRect;
    }

    public void setyRect(float yRect) {
        this.yRect = yRect;
    }

    public float getxCirc() {
        return xCirc;
    }

    public void setxCirc(float xCirc) {
        this.xCirc = xCirc;
    }

    public float getyCirc() {
        return yCirc;
    }

    public void setyCirc(float yCirc) {
        this.yCirc = yCirc;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public int getColorRect() {
        return colorRect;
    }

    public void setColorRect(int colorRect) {
        this.colorRect = colorRect;
    }

    public int getColorCirc() {
        return colorCirc;
    }

    public void setColorCirc(int colorCirc) {
        this.colorCirc = colorCirc;
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.BLUE);
        canvas.drawOval(20, 30.2f, 300, 400, paint);
        paint.setColor(colorRect);
        canvas.drawRect(xRect, yRect, xRect + width, yRect + height, paint);
        paint.setColor(colorCirc);
        canvas.drawCircle(xCirc, yCirc, radius, paint);

    }
}


