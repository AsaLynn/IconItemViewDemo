package com.zxn.iconitemviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.zxn.iconitemview.IconItemView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IconItemView iiv_water = findViewById(R.id.iiv_water);
        ImageView imageView = iiv_water.getmIvRight();
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.mipmap.ic_launcher);
    }
}
