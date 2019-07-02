package com.keshar.sliderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

public class MainActivity extends AppCompatActivity {
    private SliderLayout mSlidder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSlidder=findViewById(R.id.slider);

        TextSliderView textSliderView1=new TextSliderView(this);
        TextSliderView textSliderView2=new TextSliderView(this);
        TextSliderView textSliderView3=new TextSliderView(this);
        textSliderView1.description("").image(R.drawable.banner1);
        textSliderView2.description("").image(R.drawable.banner2);
        textSliderView3.description("").image(R.drawable.banner3);

        mSlidder.addSlider(textSliderView1);
        mSlidder.addSlider(textSliderView2);
        mSlidder.addSlider(textSliderView3);
    }
}
