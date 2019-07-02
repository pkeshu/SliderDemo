package com.keshar.sliderdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.slider.library.SliderLayout
import com.daimajia.slider.library.SliderTypes.TextSliderView
import kotlinx.android.synthetic.main.activity_main.*

public class SlidderDemo:AppCompatActivity(){
    private lateinit var mSlidderDemo:SliderLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mSlidderDemo=findViewById(R.id.slider)

        val texSliderView1=TextSliderView(this)
        val texSliderView2=TextSliderView(this)
        val texSliderView3=TextSliderView(this)
        texSliderView1.image(R.drawable.banner1)
        texSliderView2.image(R.drawable.banner2)
        texSliderView3.image(R.drawable.banner3)
        text.text="Hi how are You"
        mSlidderDemo.addSlider(texSliderView1)
        mSlidderDemo.addSlider(texSliderView2)
        mSlidderDemo.addSlider(texSliderView1)

    }
}