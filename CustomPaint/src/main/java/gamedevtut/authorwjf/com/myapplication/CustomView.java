package gamedevtut.authorwjf.com.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by user on 2017-02-16.
 */

public class CustomView extends View {

    private Paint paint;

    public CustomView(Context context){
        super(context);
    }

    protected  void onDraw(Canvas canvas){
        super.onDraw(canvas);

        paint = new Paint();

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);

        canvas.drawRect(100,100,200,200,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10); //선의 두께를 의미
        paint.setColor(Color.GREEN);
        canvas.drawRect(220,100,320,200,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(128,255,0,0);
        canvas.drawRect(100,220,200,320,paint);

        paint.setColor(Color.BLUE);
        canvas.drawCircle(400,400,200,paint);
//
//        paint.setAntiAlias(false);
//        canvas.drawCircle(400,800,200,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setColor(Color.RED);
        paint.setTextSize(50);
        canvas.drawText("TEXT STROKE", 100, 800, paint);


        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        paint.setTextSize(50);
        canvas.drawText("TEXT FILL", 100, 900, paint);
    }



}
