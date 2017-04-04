package gamedevtut.authorwjf.com.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/**
 * Created by user on 2017-02-16.
 */

public class CustomView extends View {

    public CustomView (Context context){
        super(context);
    }
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        int[] color = {Color.BLUE, Color.RED, Color.YELLOW, Color.MAGENTA};

        LinearGradient linearGradient1 = new LinearGradient(10,10, 200,0, Color.RED,Color.YELLOW, Shader.TileMode.CLAMP);
        LinearGradient linearGradient2 = new LinearGradient(10,210, 210,410, Color.GREEN,Color.BLUE, Shader.TileMode.CLAMP);
        LinearGradient linearGradient3 = new LinearGradient(10,210, 210,620,color,null,Shader.TileMode.CLAMP);

        paint.setShader(linearGradient1);
        canvas.drawRect(10,10,200,200,paint);

        paint.setShader(linearGradient2);
        canvas.drawRect(10,210,210,410,paint);

        paint.setShader(linearGradient3);
        canvas.drawRect(10,420,210,620,paint);

        canvas.drawCircle(420,350,100,paint);




    }



}
