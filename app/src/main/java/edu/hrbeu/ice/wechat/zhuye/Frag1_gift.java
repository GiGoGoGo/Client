package edu.hrbeu.ice.wechat.zhuye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import edu.hrbeu.ice.wechat.R;

public class Frag1_gift extends AppCompatActivity {

    private List<Frag1_gift_image> List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag1_gift);

        initOnes();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gift_recycleView);
        //瀑布流效果
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(2
                ,StaggeredGridLayoutManager.VERTICAL);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Adapter adapter = new Adapter(List);
        recyclerView.setAdapter(adapter);
    }

    public void initOnes()
    {
        for(int i=0; i<2; i++)
        {
            Frag1_gift_image one1 = new Frag1_gift_image(R.drawable.gift1);
            List.add(one1);
            Frag1_gift_image one2 = new Frag1_gift_image(R.drawable.gift2);
            List.add(one2);
            Frag1_gift_image one3 = new Frag1_gift_image(R.drawable.gift3);
            List.add(one3);
            Frag1_gift_image one4 = new Frag1_gift_image(R.drawable.gift4);
            List.add(one4);
            Frag1_gift_image one5 = new Frag1_gift_image(R.drawable.gift5);
            List.add(one5);
            Frag1_gift_image one6 = new Frag1_gift_image(R.drawable.gift6);
            List.add(one6);

        }
    }
}
