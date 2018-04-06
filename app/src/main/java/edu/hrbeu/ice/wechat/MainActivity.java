package edu.hrbeu.ice.wechat;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import edu.hrbeu.ice.wechat.zhuye.FragmentPage1;
import edu.hrbeu.ice.wechat.zhuye.FragmentPage2;
import edu.hrbeu.ice.wechat.zhuye.FragmentPage3;
import edu.hrbeu.ice.wechat.zhuye.FragmentPage4;

public class MainActivity extends FragmentActivity {
    //定义FragmentTabHost对象
    private FragmentTabHost mTabHost;
    //定义一个布局
    private LayoutInflater layoutInflater;
    //定义一个数组来存放Fragment界面
    private Class fragmentArray[] = {FragmentPage1.class,FragmentPage2.class,
            FragmentPage3.class,FragmentPage4.class};
    //定义数组来存放按钮图片
    private int mImageViewArray[] = {R.drawable.icon_home_nor,R.drawable.icon_meassage_nor,
    R.drawable.icon_more_nor,R.drawable.icon_selfinfo_nor};
    //Tab选项卡的文字
    private String mTextArray[] = {"首页","消息","活动","我"};
    private LinearLayout title_lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_lin = (LinearLayout)findViewById(R.id.title_lin);
        title_lin.setBackgroundColor(Color.GREEN);
        //实例化布局对象
        layoutInflater = LayoutInflater.from(this);
        initView();
    }
    //初始化组件
    private void initView(){
        //实例化TabHost对象，得到TabHost
        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this,getSupportFragmentManager(),R.id.realtablecontent);
        //得到Fragment的个数
        int count = fragmentArray.length;
        for(int i=0; i<count; i++){
            //为每个Tab按钮设置图标和文字
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(mTextArray[i]).setIndicator(getTabItemView(i));
            //将Tab按钮添加进Tab选项卡中
            mTabHost.addTab(tabSpec,fragmentArray[i],null);
            //设置Tab按钮的背景
            mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.home_btn_bg);
        }
        mTabHost.setCurrentTabByTag(mTextArray[0]);
    }
    private View getTabItemView(int index){
        View view = layoutInflater.inflate(R.layout.tab_item,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(mImageViewArray[index]);
        TextView textView = (TextView)view.findViewById(R.id.textview);
        textView.setText(mTextArray[index]);
        return view;

    }
}
