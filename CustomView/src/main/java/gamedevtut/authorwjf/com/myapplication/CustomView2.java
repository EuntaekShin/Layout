package gamedevtut.authorwjf.com.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/**
 * Created by user on 2017-02-16.
 */

    public class CustomView2 extends View {
        public CustomView2(Context context){
            super(context);
        }

        protected void onDraw(Canvas canvas){
            canvas.drawColor(Color.CYAN);
            Paint paint = new Paint();

//
//            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
//            canvas.drawBitmap(bitmap, 10, 10, null);


            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
            BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT,Shader.TileMode.REPEAT);
            paint.setShader(bitmapShader);
            canvas.drawRect(10,30,900,2000,paint);
        }

}
