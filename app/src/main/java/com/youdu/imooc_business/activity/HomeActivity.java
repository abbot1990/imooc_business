package com.youdu.imooc_business.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.youdu.imooc_business.R;
import com.youdu.imooc_business.activity.base.BaseActivity;
import com.youdu.imooc_business.view.fragment.HomeFragment;

public class HomeActivity extends BaseActivity implements View.OnClickListener{

    private FragmentManager mFragmentManager;

    private RelativeLayout mHomeLayoutView;
    private RelativeLayout mPondLayoutView;
    private RelativeLayout mMessageLayoutView;
    private RelativeLayout mMineLayoutView;

    private TextView mHomeImageView;
    private TextView mMessageImageView;
    private TextView mMineImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);

        initView();

        //默认fragment
        mFragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_layout,new HomeFragment());
        fragmentTransaction.commit();
        mHomeImageView.setBackgroundResource(R.drawable.comui_tab_home_selected);


    }

    //初始化view
    private void initView(){
        mHomeLayoutView = (RelativeLayout)findViewById(R.id.home_layout_view);
        mPondLayoutView = (RelativeLayout)findViewById(R.id.pond_layout_view);
        mMessageLayoutView = (RelativeLayout)findViewById(R.id.message_layout_view);
        mMineLayoutView = (RelativeLayout)findViewById(R.id.mine_layout_view);

        mHomeImageView = (TextView)findViewById(R.id.home_image_view);
        mMessageImageView = (TextView)findViewById(R.id.message_image_view);
        mMineImageView = (TextView)findViewById(R.id.mine_image_view);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_layout_view:

                mHomeImageView.setBackgroundResource(R.drawable.comui_tab_home_selected);
                //mPondView.setBackgroundResource(R.drawable.comui_tab_pond);
                mMessageImageView.setBackgroundResource(R.drawable.comui_tab_message);
                mMineImageView.setBackgroundResource(R.drawable.comui_tab_person);

                break;
            case R.id.pond_layout_view:

                break;
            case R.id.message_layout_view:

                break;
            case R.id.mine_layout_view:

                break;
        }
    }
}
