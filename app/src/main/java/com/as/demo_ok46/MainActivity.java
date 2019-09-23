package com.as.demo_ok46;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.as.demo_ok46.adapter.CardAdapter;
import com.as.demo_ok46.adapter.MyAdapter;
import com.as.demo_ok46.custom.CardScaleHelper;
import com.as.demo_ok46.custom.SpeedRecyclerView;
import com.as.demo_ok46.data.SmallData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Integer> listimages = new ArrayList<Integer>() {{
            add(R.drawable.bg1);
            add(R.drawable.bg2);
            add(R.drawable.bg3);
            add(R.drawable.bg4);
            add(R.drawable.bg5);
            add(R.drawable.bg6);
            add(R.drawable.bg7);
            add(R.drawable.bg8);
            add(R.drawable.bg9);
            add(R.drawable.bg10);
            add(R.drawable.bg11);
            add(R.drawable.bg12);
            add(R.drawable.bg13);
        }};

        List<SmallData> listimages2 = new ArrayList<SmallData>() {{
            add(new SmallData(false, R.drawable.bg1));
            add(new SmallData(false, R.drawable.bg2));
            add(new SmallData(false, R.drawable.bg3));
            add(new SmallData(false, R.drawable.bg4));
            add(new SmallData(false, R.drawable.bg5));
            add(new SmallData(false, R.drawable.bg6));
            add(new SmallData(false, R.drawable.bg7));
            add(new SmallData(false, R.drawable.bg8));
            add(new SmallData(false, R.drawable.bg9));
            add(new SmallData(false, R.drawable.bg10));
            add(new SmallData(false, R.drawable.bg11));
            add(new SmallData(false, R.drawable.bg12));
            add(new SmallData(false, R.drawable.bg13));

        }};


        final SpeedRecyclerView sbv = findViewById(R.id.sbv);
        RecyclerView rv = findViewById(R.id.rv);


        CardAdapter myAdapter = new CardAdapter(listimages);
        sbv.setAdapter(myAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        sbv.setLayoutManager(layoutManager);

        // mRecyclerView绑定scale效果
        CardScaleHelper mCardScaleHelper = new CardScaleHelper();
        mCardScaleHelper.setCurrentItemPos(2);
        mCardScaleHelper.attachToRecyclerView(sbv);

        /*******************************************************/

        MyAdapter myAdapter2 = new MyAdapter(R.layout.item_small, listimages2);
        rv.setAdapter(myAdapter2);

        final LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(layoutManager2);

        mCardScaleHelper.setIchangelistener(new CardScaleHelper.Ichangelistener() {
            @Override
            public void itemChanged(int position) {
                if (position > 0) {
                    final TopSmoothScroller mScroller = new TopSmoothScroller(MainActivity.this);

                    mScroller.setTargetPosition(position - 1);
                    layoutManager2.startSmoothScroll(mScroller);

                }
            }
        });


        rv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                sbv.onTouchEvent(motionEvent);
                return true;
            }
        });


    }
}
