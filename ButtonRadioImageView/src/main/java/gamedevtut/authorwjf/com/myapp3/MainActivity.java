package gamedevtut.authorwjf.com.myapp3;

/*
버튼을 누르면 프레임 뷰들이 넘어가는 예제

View <-- Text view <-- 1.Button <-- compound Button <- 1.Radio Button
                                                    <- 2.Check Box
                   <-- 2.EditText

                   <-- 3.ImageView <-- image Button


 버튼의 4가지 상태
 1. state_ focused: 커서가 오는경우
 2. state_ selected: 사용자가 선택을 했을경우
 3. state_pressed: 사용자가 눌렀을 경우
 4. state_enabled<->disable: 버튼 활성화 상태
 */



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
