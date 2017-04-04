package com.example.user.linearlayout;

/*leanerLayout
// 가로 세로 를 나누기 위해 orientation 필요
//match_parent 의미는 화면 전체
// wrap content 는 정해진 크기만큼 표현
// back ground color 넣을수 있으며 red,green,blue표현가능 (#필요)
// ex (#f00 red) (#0f0 green)
//안드로이드 크기를 나타내는건 px(픽셀),
//2.dp(densty(밀도) independant(독립적) pixel
// 2-1)160dip 1인치 당 160개의 점이있는 화면을 의미
// 2-2)스마트폰 화면이 다다르기 때문에 우리가 만약 80dp로 만들었을경우 160dip 기준화면일경우 제대로 보일지라도
//2-3)320dip에서는 작아보일수 도 있다.
//3.sp (scale indpendant pixel)
//글꼴 (in,mm,em)
//버튼등을 만들어 줄떄는 id를 사용
//android:id="@+id/btn1" +를 쓰는건 아이디를 생성하겠다, +가없을경우는 참조하겠다
 모가있는지 볼때는 컨트롤 스페이스
---------------------------------------------
  xml파일은 _언더바를 사용해야한다

Module 이란? 이클립스에서 얘기하는 project(하위) ,화면을 추가할땐 모듈을 추가해야한다.
android studio 에서 project 는 이클립스의 WorkSpace와 같아(새로운 환경의 앱 개발)

Gradle 이란?  빌드를 자동화 해주는것
Groovy라는 언어를 사용 (자바+파이썬)
app을 처음 만들면 buil.gradle, settings.gradle,local.properties를포함하고
 각모둘별 build.gradle 와 난독화를 거친다
 app을 배포하는건 apk파일 이고 그파일을 만드는 과정을 빌드라고한다
컴파일(고급 언어를 컴퓨터 기계어로 번역해 해석가능하게 하는것) 와
 빌드(리소스(이미지,동영상,레이아웃, 바이러니파일 등을 모두다 하나의 어플리케이션을 만들수 있도록 하는것
---------------------------------------------

apk 에 대하여 설명
1.APK에 대한 정의
apk 파일은 앱이다 (android package)
2.apk 가 만들어지는 과정
 1).컴파일 (우리의 언어를 컴퓨터가 알아들을 수 있도록 하는 과정)
 2).패키징 (앱이 동작할 수 있도록 포장하는것-보기좋게 하거나 보호하거나)
 3).서명

 4)세부설명
   가)apk의 컴파일 단계
    . application의 resource(layout, image ,Manifest etc) 를 aapt(andriod asset packaging tool) 통해
     Java 파일로 읽을 수 있게 해주는것.  -> R.java파일로 만들어
    1)application src code(mainActivity.java) 과같은 java파일에서  쓸수 있게 해준다
    2)Java interfaces 에서도 사용가능(카메라 , 지도 등)
    --> 이런파일을 통해 최종적으로 클래스 파일과 dex(안드로이드 실행파일을 만들어준다(exe와 같은개념)
    (ex -Mainactivity.class, androild.dex)

 나)apk의 패키징 단계
 -aapt를 통해 compiled Resources 파일과 dex.files, other Resources 등을 apkbuilder를 통해 패킹하는툴
 -apkbuildr 를 통해서 APK파일이 만들어지고

 다)apk의 서명 단계
 jar singer 를 통해 singed ApK가 만들어진다
 그후 zipalign 을 통해 google store 에 올릴수 있는 APK파일이 만들어진다.

3.APK의 내부
apk는 압축파일 zip등을 통해 압축을 풀수 있고 다음과 같은 파일이 있다
assets folder(웹에 필요한 데이터) , META-INF(서명과 관련) , RES, ANDOIDMANIFEST, CLASSES, RESOURES

4.APK의 구성
1)실행영역 - java 또는 c로 만들어진 .DEX(dalvik Executalble) ,.SO 에 포함되어 있다.
    (1) 안드로이드는 JVM이 아닌 dalvik이라는 가상머신을 사용한다.
    (2) 롤리팝(5.0)부터는 ART라는 가상머신으로 바뀌었다.
    (3) NDK를 통해 c로 개발할 수 있도록 지원한다.
2)설정영역 - 버전, 이름, 권한 등 설정관련 정보
    (1) androidManifest 파일 에 대한 설명
     가) package name(org type, org Name, .appName, com.Name) ,
     나)version code (구글스토어와 기기상의 앱의 코드를 비교해서 알려줌)
     다)version name
     라) permision -> 권한을 알려주는 부분(인터넷 권한, 주소록등)
3)리소스영역  - 레이아웃, 테스트정보, 이미지 ,언어지원등
    (1) 이미지 (.png), 레이아웃(.xml), 언어지원(XML)
4)서명영역 - 악의적 도용막기 위한 서명 정보
    META-INF (파일, 서명)
    서명이란 RSA 암호문 알고리즘을 통해 암호화한다

5. 우리가 key store를 서명 하지 않았음에도 쓸 수 있는건 디버그용 key store때문
6. 디버그용 key store는 사용기간이 1년 그래서 배포를 하기 위해선 key store 설치 필요
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_activity);//setcontent를 통해 액티비티를 객체화(메모리에 등록)
                                                //메모리 주소에 있는 것을 불러오는것
    }
}
