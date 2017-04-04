package gamedevtut.authorwjf.com.myapplication;
/*
뷰에다가 그릴수 있게 해주는것이 canvas

onDraw 메소드 안에서 사용해만 한다.

 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        CustomView myView = new CustomView(this);
        setContentView(myView);
    }
}
