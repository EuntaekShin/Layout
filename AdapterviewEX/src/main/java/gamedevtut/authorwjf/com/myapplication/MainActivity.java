package gamedevtut.authorwjf.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<GameData> data = null;
    private GameAdapter gAdapter = null;
    private ListView listView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gAdapter = new GameAdapter(this);
       // data = new ArrayList<GameData>();

//        data.add(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
//        data.add(new GameData(R.drawable.abc,"Premier","SoccerGame"));
//        data.add(new GameData(R.drawable.abc,"K리그","SoccerGame"));
//        data.add(new GameData(R.drawable.abc,"한국야구","BaseBallGame"));
//        data.add(new GameData(R.drawable.abc,"미국야구","BaseBallGame"));
//        data.add(new GameData(R.drawable.abc,"일본야구","BaseBallGame"));
//        data.add(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
//        data.add(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
//        data.add(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
//        data.add(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));


        gAdapter.addItem(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"Premier","SoccerGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"K리그","SoccerGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"한국야구","BaseBallGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"미국야구","BaseBallGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"일본야구","BaseBallGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));
        gAdapter.addItem(new GameData(R.drawable.abc,"BaseBall","BaseBallGame"));

     //   gAdapter = new GameAdapter(this, R.layout.game_list,data);
        gAdapter = new GameAdapter(this);

        listView = (ListView)findViewById(R.id.lv01);
        listView.setAdapter(gAdapter);

    }
}
