package gamedevtut.authorwjf.com.galleryview;
/*
1. activity main 에 갤러리와 이미지뷰 형성
2. garllery_item 만들어서 아이템 정의
3. main activity 형성
    1) 갤러리에 들어갈 아이템들의 자료 구조 생성
    2) drawble에 있는 이미지를 갤러리 리스트에 추가하는 작업
    3) imageview, galleryview 객체 생성
 .

 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //1.갤러리에 들어갈 아이템들의 자료구조 생성
    GalleryAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //drawable에 있는 이미지를 galleryList 에 추가하는 작업

        adapter = new GalleryAdapter(this); //어뎁터 생성

//        for (int i =1; i<6; i++){ //get 리소스를 통해 drawble 폴더에서 가져온다.
//            galleryList.add(getResources().getIdentifier("g"+i,"drawable",this.getPackageName()));
//        }


        for(int i=1; i<6; i++){
            adapter.addItem(getResources().getIdentifier("g"+i,"drawable",this.getPackageName()));
        }



        final ImageView iv =(ImageView)findViewById(R.id.img01);//image View를 객체를 가져오는것


        Gallery gallery = (Gallery)findViewById(R.id.gallery01);// garllery 객체를 생성


        gallery.setAdapter(adapter);// 만든 갤러리에 어뎁터를 연결.(갤러리 어뎁터에 셋팅)


        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                Integer galleryItem = adapter.getGalleryItem(position);
                iv.setImageResource(galleryItem);
            }

        });


    }
}
