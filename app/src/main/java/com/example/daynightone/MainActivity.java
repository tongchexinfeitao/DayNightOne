package com.example.daynightone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 第一种实现夜间模式  用设置主题的方式
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置对应的主题 ，在ui创建好之后设置主题无效，所以要放到setContentView（）方法前面setTheme()
        ThemeUtil.onActivityCreatedSetTheme(this);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View v) {

        //切换日夜间模式
        ThemeUtil.ChangeCurrentTheme(this);
    }
}
