package com.example.user.linearlayout1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*layout part
linearLayout
 첫번째줄 xmlns 는 처음에 켜면 안드로이드에서 정한 레이아웃을 쓰겠다고 선언(처음 한번만 사용)
 1. 정렬
 gravity(배치) - 내용물의 배치 속성            정렬(Align) 이라는 의미로 사용
 layout_gravity -  뷰자체의 배치 속성

 - 안드로이드 layout_gravity 는 기본이 레프트이다

*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
}
