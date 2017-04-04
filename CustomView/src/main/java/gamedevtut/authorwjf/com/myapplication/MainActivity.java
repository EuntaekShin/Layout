package gamedevtut.authorwjf.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

       // CustomView myView = new CustomView(this);
        CustomView2 myView2 = new CustomView2(this);
        setContentView(myView2);
    }
}
