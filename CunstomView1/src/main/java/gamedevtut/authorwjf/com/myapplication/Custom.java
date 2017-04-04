package gamedevtut.authorwjf.com.myapplication;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by user on 2017-02-16.
 * 1.view 클래스 상속받기
 * 2.생성자 만들기
 * 3. paint 객체 이용하기
 * 4. ondraw method 구현하기
 * 5. 메인엑티비티 추가
 */

public class Custom extends View { //view 클래스 상속 받기

    public Custom(Context context){ //생성자를 통해 super의 context를 가져옴
        super(context);
    }

    protected void onDraw(Canvas canvas){ //화면에 도형을 나타내기 위해 쓰는
        canvas.drawColor(Color.YELLOW);

        Paint paint = new Paint();

        paint.setColor(Color.RED);

        canvas.drawCircle(500, 500, 300,paint);


//        paint.setColor(Color.GREEN);
//        canvas.drawCircle(500, 800,200, paint)
// /paint.setColor(Color.GREEN);
        paint.setColor(0xaa00ff00);//16진수이용해서 2자리씩 해야한다.
        canvas.drawRect(200,200,600,500,paint);
        paint.setColor(Color.BLACK);
        canvas.drawLine(100,400,700, 700,paint);
        canvas.drawPoint(900,900,paint);
    }



}
