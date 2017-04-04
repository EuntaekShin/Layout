package gamedevtut.authorwjf.com.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.ArrayList;



//추상 클래스인 BaseAdapter를 상속(getview와 getcount를 가짐)

public class GameAdapter extends BaseAdapter {


    private Context mContext =null;
    // private int layout = 0;
    //private ArrayList<GameData> gData;
   private ArrayList<GameData> gData = new ArrayList<GameData>();

    //private LayoutInflater inflater = null;

    //public GameAdapter(Context context, int layout, ArrayList<GameData> gData)


    //생성자
    public GameAdapter(Context mContext){
        this.mContext = mContext;
   //     this.layout = layout;
     //   this.gData = gData;
     //   this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(GameData gd){
        gData.add(gd);
    }

    //아이템의 갯수를 리턴 (배열 갯수만큼 리턴)
    public int getCount(){ //GameData의 갯수 (실제 화면에 보여주는 게임이 몇개이냐)
        return gData.size();
    }
    //getcount를 통해 얻어온 갯수를
    public Object getItem(int position){  //position은 아이템의 index를 의미
        return gData.get(position).getTitle(); //각 포지션의 타이틀이 무엇이냐?
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //화면의 위치값을 알아오는것
    public long getItemID(int position){
        return position;
    }


    // position은 index,  현재 index에 해당하는 view객체 를 convertView, ViweGroup 컨버트뷰를 포함하는 부모객체
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView itemView;

        if (convertView == null) { //맨처음 뷰를 만드는 과정 (한번 만든후에 null값이 아니면 재활용가능)
            itemView = new ItemView(mContext, gData.get(position));
           // convertView = inflater.inflate(this.layout, parent, false);
        }else {
            itemView = (ItemView) convertView;
        }
            itemView.setIcon(gData.get(position).getICon());
            itemView.setTitle(gData.get(position).getTitle());
            itemView.setComment(gData.get(position).getComment());


//        ImageView ico = (ImageView) convertView.findViewById(R.id.ico_game);
//        TextView gTitle = (TextView) convertView.findViewById(R.id.txt_title);
//        TextView gComment = (TextView) convertView.findViewById(R.id.tet_comment);
//        Button btn_sel = (Button) convertView.findViewById(R.id.btn_select);
//
//        ico.setImageResource(gData.get(position).getICon());
//        gTitle.setText(gData.get(position).getTitle());
//        gComment.setText(gData.get(position).getComment());


        if ((position % 2) == 1) {
           // convertView.setBackgroundColor(0x800000ff);
            itemView.setBackgroundColor(0x800000ff);
        } else {
            itemView.setBackgroundColor(0x200000ff);
           // convertView.setBackgroundColor(0x200000ff);
        }
       // return convertView;
        return itemView;
    }


}
