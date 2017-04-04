package gamedevtut.authorwjf.com.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by user on 2017-03-03.
 */

public class CustomAdapter extends BaseAdapter { //3번째 단계 아답터 만들기

    private Context mContext; //context는 반드시필요
    private int[] data; // 데이터를 쓰기위함

    public CustomAdapter(Context mContext, int[]data){ //생성자 만들기
        this.mContext=mContext;
        this.data=data;
    }

    public int getCount(){  // 아이템의 갯수를 파악
        return data.length;
    }

    public Object getItem(int position){
        return data[position];
    }
    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){ //아이템에서 사용할 것들을 리턴해준다
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200,200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5,5,5,5);

        }else {
            imageView = (ImageView)convertView;
        }
        imageView.setImageResource(data[position]);
        return imageView;
    }

}
