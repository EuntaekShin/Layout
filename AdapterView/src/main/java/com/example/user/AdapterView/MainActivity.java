package com.example.user.AdapterView;
/*
데이터    어댑터            어댑터뷰(화면에 보여지기 위한 형태)
        ArrayAdapter        list view
        simplaAdapter       Gridvien
        CursorAdapter       spinner
                            Grvery
                            선택 위젯


어댑터는 데이터를 어댑터뷰에 어떻게 보여줄지 정하기 위해 사용한다
현실에서도 어댑터를 통해 220v를 통해 110v 5v등으로 나눈다.

//데이터와 코드를 따로분리하는게 좋다

여태껏 안드로이드에서 제공해주는 adapter view를 사용했지만 adapeter를 이용해 우리가 직접 만들수있다
우리가 xml을 만들고나면 adpater가 adpater view로 보내준다
adapter는 데이터를 관린한다.
adpater를 통해서 아이템 스타일을 정할수 있다.
늘 getview() method를 호출하여 화면을 구성한다
getview 는 리턴값을 가진다 (view, view group)

1.item을 위한 xml구조 정의
2.item을 위한 view를 정의 (객체화- inflation) (java코드를이용)
3.어댑터 정의(custom Adapter를 만드는 과정-원하는 어뎁터를 만드는 과정)(제일 중요한 파트)
    1) BaseAdapter를 상속받아서 사용
    2) getView() ->리턴 값(item view)가 된다.
4.listview를 다루기
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arryList = null;
    ArrayAdapter<String> adapter = null;
    ListView lv =null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arryList = new ArrayList<String>();
        arryList.add("김말동");
        arryList.add("헝말동");
        arryList.add("박말동");
        arryList.add("신말동");        //data
        arryList.add("이말동");
        arryList.add("초말동");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,arryList);//adapter

        lv = (ListView)findViewById(R.id.lv1); //adapterview
        lv.setAdapter(adapter);
    }
}
