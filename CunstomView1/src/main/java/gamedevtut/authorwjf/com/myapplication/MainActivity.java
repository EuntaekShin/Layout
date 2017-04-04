package gamedevtut.authorwjf.com.myapplication;
/*
.xml 파일을 통해서 레이아웃을 만드면
레이아웃을 통해서 activity(화면)을 만드는데 자바 코드를 이용해서 만들었다.
액티비티 *.java

자바코드로 만든 뷰를 커스텀뷰라고 할 수 있다 .
이뷰를 activity에 적용하는것이 커스텀뷰


 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

        Custom custom = new Custom(this);
        setContentView(custom);
    }
}
