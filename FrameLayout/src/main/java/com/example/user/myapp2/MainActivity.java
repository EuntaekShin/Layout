/*
버튼을 누르면 프레임 뷰들이 넘어가는 예제

View <-- Text view <-- 1.Button <-- compound Button <- 1.Radio Button
                                                    <- 2.Check Box
                   <-- 2.EditText

                   <-- 3.ImageView <-- image Button

 */



package com.example.user.myapp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//onclickListner는 버튼을눌렀을때 실행이 되는것
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int textIndex =0;
    private TextView txtView01; //프레임 뷰들
    private TextView txtView02;
    private TextView txtView03;


    private Button preBtn; //버튼
    private Button nxtBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//메모리에 객체화 하는과정(항상 메모리에 먼저 올려야한다)

        //처음 불러오는 oncreate method 안에서 레이아웃으로부터 객체들을 가져와야한다.
        //아이디만 찾아오는것으론 어떤 형식인지 모르기때문에 캐스팅 해줘야한다
        txtView01 =(TextView)findViewById(R.id.txt1);
        txtView02 =(TextView)findViewById(R.id.txt2);
        txtView03 =(TextView)findViewById(R.id.txt3);//객체를 찾아오는 파일

        preBtn=(Button)findViewById(R.id.btnPrev);
        nxtBtn=(Button)findViewById(R.id.btnNext);

        preBtn.setOnClickListener(this);//버튼을 등록하는 과정
        nxtBtn.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnPrev:
                if(textIndex > 0){
                    textIndex--;
                }
                changeView();
                break;
            case R.id.btnNext:
                if(textIndex < 2){
                    textIndex++;
                }
                changeView();
                break;
                default:break;
        }
    }

    private void changeView(){
        if(textIndex ==0){
            txtView01.setVisibility(View.VISIBLE);
            txtView02.setVisibility(View.INVISIBLE);
            txtView03.setVisibility(View.INVISIBLE);// 보일지 안보일지를 설정해주는
        } else if(textIndex ==1){
            txtView01.setVisibility(View.INVISIBLE);
            txtView02.setVisibility(View.VISIBLE);
            txtView03.setVisibility(View.INVISIBLE);// 보일지 안보일지를 설정해주는
        } else if(textIndex ==2){
            txtView01.setVisibility(View.INVISIBLE);
            txtView02.setVisibility(View.INVISIBLE);
            txtView03.setVisibility(View.VISIBLE);// 보일지 안보일지를 설정해주는
        }

    }

}
