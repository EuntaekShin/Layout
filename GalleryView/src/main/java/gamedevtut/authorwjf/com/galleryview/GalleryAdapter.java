package gamedevtut.authorwjf.com.galleryview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/*
base adatper 에서 4가지 오버라이딩 해야하는것
getcount
getItem
getItemId
getView


 */

/**
 * Created by user on 2017-03-03.
 */

public class GalleryAdapter extends BaseAdapter {

    private Context mContext ;// 항상 필요
    LayoutInflater inflater ;
    private List<Integer> galleryList = new ArrayList<Integer>();

    public GalleryAdapter(Context mContext){ //생성자
        this.mContext = mContext;
        inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //컨테스트는 시스템 서비스에서 만들어진다.
    }

    //갤러리 리스트에 item 추가
    public void addItem(Integer integer)
    {
        galleryList.add(integer);
    }

    public Integer getGalleryItem(int position){
        return galleryList.get(position);
    }


    public int getCount(){ //아이템의 갯수를 지정하는부분

        return galleryList.size();
    }

    public Object getItem(int position){//사이즈를 알게되면 해당 포지션으로 사용

        return position;
    }

    public long getItemId(int positon ){
        return positon;
    }

    public View getView(int position, View convertView, ViewGroup parent){ //사용자가 getview를 이용해서 아이템을 재정의 할수 있다
        if(convertView ==null){
            convertView = inflater.inflate(R.layout.gallery_item,parent,false); //레이아웃의 파라미터만가져다 쓰겠다
        }
        ImageView imageview = (ImageView)convertView.findViewById(R.id.gimg01);

        imageview.setImageResource(galleryList.get(position));//갤러리에 있는 아이템을 컨버트뷰(아이템뷰)에 셋팅을 해야한다.

        return convertView;

    }
 }
