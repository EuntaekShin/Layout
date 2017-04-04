package com.example.user.linearlayout1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LayoutTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //layout을 자바코드로 생성 (new 연산자 이용)

        //new 연산자 이용해 객체화
        LinearLayout mainLayout = new LinearLayout(this); //this는 layoutTestActivity를 물려받는다다

        // 오리엔 테이션 설정
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        //추가할 뷰들의 속성
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT );
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT );



        //버튼 추가
        Button btn1 = new Button(this);
        btn1.setText("button01");
        btn1.setLayoutParams(params);


        Button btn2 = new Button(this);
        btn2.setText("button02");
        btn2.setLayoutParams(params1);

        TextView txt1 = new TextView(this);
        txt1.setText("textview");
        txt1.setBackgroundColor(Color.YELLOW);
        txt1.setLayoutParams(params);

        mainLayout.addView(btn2);
        mainLayout.addView(btn1);
        mainLayout.addView(txt1);
       setContentView(mainLayout); //setcontentview 를 통해 레이아웃을 불러오는것
    }
}
