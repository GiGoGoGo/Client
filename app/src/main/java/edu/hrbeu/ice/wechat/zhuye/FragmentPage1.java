package edu.hrbeu.ice.wechat.zhuye;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jude.rollviewpager.RollPagerView;

import edu.hrbeu.ice.wechat.R;
import edu.hrbeu.ice.wechat.TestNormalAdapter;

/**
 * Created by WIN8 on 2017/4/22.
 */

public class FragmentPage1 extends Fragment implements View.OnClickListener {

    /*private EditText mEditText;
    private ImageView mImageView;
    private ListView mListView;
    private TextView mTextView;
    Context context;//上下文
    Cursor cursor;//光标*/

    private View view;
    private RollPagerView mRollViewPager;
    private Button btn_gift;
    private Button btn_need;
    private Button btn_accept;
    private Button btn_product;
    private Intent mintent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frame1_item, null);

        mRollViewPager = (RollPagerView) view.findViewById(R.id.roll_view_pager);

        //设置播放时间间隔
        mRollViewPager.setPlayDelay(1000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new TestNormalAdapter());

        btn_gift = (Button)view.findViewById(R.id.btn_gift);
        btn_need = (Button)view.findViewById(R.id.btn_need);
        btn_accept = (Button)view.findViewById(R.id.btn_accept);
        btn_product = (Button)view.findViewById(R.id.btn_product);

        btn_gift.setOnClickListener(this);
        btn_need.setOnClickListener(this);
        btn_accept.setOnClickListener(this);
        btn_product.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_gift:
                mintent = new Intent(getActivity(),Frag1_gift.class);
                startActivity(mintent);
                break;
            case R.id.btn_need:
                mintent = new Intent(getActivity(),Frag1_need.class);
                startActivity(mintent);
                break;
            case R.id.btn_accept:
                mintent = new Intent(getActivity(),Frag1_accept.class);
                startActivity(mintent);
                break;
            case R.id.btn_product:
                mintent = new Intent(getActivity(),Frag1_product.class);
                startActivity(mintent);
                break;
            default:
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

