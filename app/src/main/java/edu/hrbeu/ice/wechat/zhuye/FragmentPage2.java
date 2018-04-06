package edu.hrbeu.ice.wechat.zhuye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import edu.hrbeu.ice.wechat.R;

/**
 * Created by WIN8 on 2017/4/22.
 */

public class FragmentPage2 extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frame2_item,container,false);
        Toast.makeText(view.getContext(),"暂无消息提醒",Toast.LENGTH_LONG).show();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(view.getContext(),"暂无消息提醒",Toast.LENGTH_LONG);

    }
}
