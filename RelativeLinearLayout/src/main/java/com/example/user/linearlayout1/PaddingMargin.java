package com.example.user.linearlayout1;
/*
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main1"
    android:orientation="vertical"  가로 ,세로 (리니어레이아웃에만 해당)
    android:layout_width="match_parent"  전체 채우기
    android:layout_height="match_parent"
    android:baselineAligned="true"> 뷰와 버튼등의 아랫줄 맞추기

    <LinearLayout  리니어 레이아웃안에 리니어 레이아웃
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
        android:id ="@+id/txt01"  아이디 항상 필요
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textColor="#00f"
        android:textSize="30dp"
        android:background="#0ff"
        android:text="텍스트"
            android:layout_weight="1"/>

        <TextView
        android:id ="@+id/txt02"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textColor="#f00"
        android:textSize="30dp"
        android:background="#f0f"
        android:text="텍스트"
            android:layout_weight="1"
        />

        <TextView
        android:id ="@+id/txt03"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30dp"
        android:text="텍스트"
            android:layout_weight="1"/>레이아웃상의 위치 반
    </LinearLayout>

    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        >

        <TextView   textview, button,입력박스 등을 위젯이라고 한다.
            android:id ="@+id/txt04"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:background="#ff0"
            android:text="텍스트"
            android:gravity="center" 글자위치 (가운데 정렬)
            android:layout_weight="1"레이아웃상의 위치 반 레
            />


        <TextView
            android:id ="@+id/txt05"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:background="#35a"
            android:text="텍스트"
            android:gravity="center"
            android:layout_weight="1"
            android:layout_margin="50dp" 마진은 부모 컨테이너로 부터 뷰가 50dp 공간이 생김
            android:paddingLeft="50dp" 패딩은 뷰안에서 안의 텍스트가50dp정도 위 아래 양 옆 공간이 생김
            />
    </LinearLayout>

</LinearLayout>


상대 레이아웃
Realtiby layout
뷰를 기준으로 다음 뷰를 어디에다가 위치 할것인가를 정하는것
기존에 만들어진 아이디를 참조해서 위치를 정할 수 있다.
먼저 만들어든 뷰를 기준으로 작성해야함 절차적으로 진행하기때문에 나중에 만든 뷰에 추가하면 오류가 난다.

 */
//padding 은 뷰와 text 영역 사이의 공간 이다.
//android:baselineAligned="true" 은 텍스트뷰나 기본줄 맞추기



public class PaddingMargin {
}
