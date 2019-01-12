package com.example.wolfsoft3.uiux_lab_ecommerce;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import Adapter.Item_Viewpager_Activity_4_Adapter;

public class Activity_4 extends AppCompatActivity implements View.OnClickListener {

//    ViewPager viewpager;
//    private Item_Viewpager_Activity_4_Adapter viewpagerAdapter;


    LinearLayout linear1,linear2,linear3,linear4,linear5;
    View u_line1,u_line2,u_line3,u_line4,u_line5;
    View d_line1,d_line2,d_line3,d_line4,d_line5;
    TextView size_text1,size_text2,size_text3,size_text4,size_text5;

    ImageView dot1,dot2,dot3,dot4,dot5,dot6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


//        viewpager = findViewById(R.id.viewpager_activity4);
//        viewpagerAdapter = new Item_Viewpager_Activity_4_Adapter(getSupportFragmentManager());
//        viewpager.setAdapter(viewpagerAdapter);
//

        linear1 = findViewById(R.id.sl_linear);
        linear2 = findViewById(R.id.x_linear);
        linear3 = findViewById(R.id.xl_linear);
        linear4 = findViewById(R.id.xs_linear);
        linear5 = findViewById(R.id.ls_linear);

        u_line1 = findViewById(R.id.sl_view_up);
        u_line2 = findViewById(R.id.x_view_up);
        u_line3 = findViewById(R.id.xl_view_up);
        u_line4 = findViewById(R.id.xs_view_up);
        u_line5 = findViewById(R.id.ls_view_up);

        d_line1 = findViewById(R.id.sl_view_down);
        d_line2 = findViewById(R.id.x_view_down);
        d_line3 = findViewById(R.id.xl_view_down);
        d_line4 = findViewById(R.id.xs_view_down);
        d_line5 = findViewById(R.id.ls_view_down);

        size_text1 = findViewById(R.id.sl_text);
        size_text2 = findViewById(R.id.x_text);
        size_text3 = findViewById(R.id.xl_text);
        size_text4 = findViewById(R.id.xs_text);
        size_text5 = findViewById(R.id.ls_text);


        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);

        dot1 = findViewById(R.id.dot1);
        dot2 = findViewById(R.id.dot2);
        dot3 = findViewById(R.id.dot3);
        dot4 = findViewById(R.id.dot4);
        dot5 = findViewById(R.id.dot5);
        dot6 = findViewById(R.id.dot6);

        dot1.setOnClickListener(this);
        dot2.setOnClickListener(this);
        dot3.setOnClickListener(this);
        dot4.setOnClickListener(this);
        dot5.setOnClickListener(this);
        dot6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sl_linear:
                u_line1.setVisibility(View.VISIBLE);
                d_line1.setVisibility(View.VISIBLE);
                size_text1.setTextSize(18);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.x_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.VISIBLE);
                d_line2.setVisibility(View.VISIBLE);
                size_text2.setTextSize(18);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;


            case R.id.xl_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.VISIBLE);
                d_line3.setVisibility(View.VISIBLE);
                size_text3.setTextSize(18);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.xs_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.VISIBLE);
                d_line4.setVisibility(View.VISIBLE);
                size_text4.setTextSize(18);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.ls_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.VISIBLE);
                d_line5.setVisibility(View.VISIBLE);
                size_text5.setTextSize(18);

                break;

            case R.id.dot1:
                dot1.setImageResource(R.drawable.ic_radio_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);

                break;

            case R.id.dot2:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ic_radio_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot3:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ic_radio_darkgray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot4:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ic_radio_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot5:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ic_radio_darkgray);
                dot6.setImageResource(R.drawable.ovel_dark_gray);
                break;

            case R.id.dot6:
                dot1.setImageResource(R.drawable.ovel_white);
                dot2.setImageResource(R.drawable.ovel_gray);
                dot3.setImageResource(R.drawable.ovel_dark_gray);
                dot4.setImageResource(R.drawable.ovel_gray);
                dot5.setImageResource(R.drawable.ovel_dark_gray);
                dot6.setImageResource(R.drawable.ic_radio_darkgray);
                break;




        }
    }

}
