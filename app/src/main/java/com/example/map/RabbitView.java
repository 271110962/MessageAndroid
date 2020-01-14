package com.example.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;

public class RabbitView extends View {
    public float rX;
    public float rY;
    public RabbitView(Context context) {
        super(context);
        rX = 270;
        rY = 180;

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.mipmap.mark);
        Matrix matrix = new Matrix();
        matrix.postScale(0.4f,0.4f);
        Bitmap resizeBmp = Bitmap.createBitmap(bitmap,0,0,bitmap.getWidth(),bitmap.getHeight(),matrix,true);
        canvas.drawBitmap(resizeBmp,rX,rY,paint);
    }

}
