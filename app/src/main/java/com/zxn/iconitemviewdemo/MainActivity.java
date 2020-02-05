package com.zxn.iconitemviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.zxn.iconitemview.IconItemView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_water1;
    private double clickNum;
    private IconItemView iiv_water1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iiv_water1 = findViewById(R.id.iiv_water1);
//        iv_water1 = iiv_water1.getmIvRight();
//        iv_water1.setVisibility(View.VISIBLE);
//        iv_water1.setImageResource(R.drawable.ic_water_loan);

        IconItemView iiv_water = findViewById(R.id.iiv_water);
        IconItemView iiv_5 = findViewById(R.id.iiv_5);
        iiv_5.setLeftText("标记");
        iiv_5.setLeftTextColor(getResources().getColor(R.color.colorPrimaryDark));
        iiv_5.setRightText("593066");
        iiv_5.setRightTextColor(getResources().getColor(R.color.c_666666));
        ImageView imageView = iiv_water.getIvRight();
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.mipmap.ic_launcher);

        iiv_water1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickNum++;
                if (clickNum % 2 == 0) {
//                    iv_water1.setImageResource(R.drawable.ic_water_loan);
                    iiv_water1.setRightIcon(R.drawable.ic_water_loan);
                } else {
//                    iv_water1.setImageResource(R.drawable.right);
                    iiv_water1.setRightIcon(R.drawable.right);
                }
            }
        });

    }
}
