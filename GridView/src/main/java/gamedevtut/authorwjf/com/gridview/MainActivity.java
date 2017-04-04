package gamedevtut.authorwjf.com.gridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    //2번째할일 변수 선언 및 어뎁터 선언
    private int [] data = {R.drawable.doosan_mark, R.drawable.hanhwa_mark,
            R.drawable.kia_mark, R.drawable.kt_mark, R.drawable.lg_mark,
            R.drawable.lotte_mark, R.drawable.nc_mark, R.drawable.nexen_mark,
            R.drawable.samsung_mark,R.drawable.sk_mark};


    private CustomAdapter adpater; // adpater를 만드는과정
    private GridView grideView;//그리드뷰를 만들어오는것

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adpater = new CustomAdapter(this,data); //4번째 할일 adpater생성

        grideView  =(GridView)findViewById(R.id.gv01);
        grideView.setAdapter(adpater); //어뎁터 셋팅


    }
}
