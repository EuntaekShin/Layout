package gamedevtut.authorwjf.com.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by user on 2017-03-01.
 */

//xml을 객체화 하는과정
public class ItemView extends LinearLayout{

    private ImageView mIcon;
    private TextView mTitle;
    private TextView mComment;

    public ItemView(Context context,GameData gData) { //생성자 생성
        super(context);

        //인플레이션
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.game_list, this, true);

        //set Icon
        mIcon = (ImageView) findViewById(R.id.ico_game);
        mIcon.setImageResource(gData.getICon());

        //set Title

        mTitle = (TextView) findViewById(R.id.txt_title);
        mTitle.setText(gData.getTitle());

        //set comment
        mComment = (TextView) findViewById(R.id.tet_comment);
        mComment.setText(gData.getComment());

    }
    public void setIcon(int icon){
        mIcon.setImageResource(icon);
    }

    public void setTitle(String data){
        mTitle.setText(data);
    }

    public void setComment(String data){
        mComment.setText(data);
    }
}
