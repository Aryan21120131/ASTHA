package com.example.astha.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.astha.Adapters.ViewPagerAdapter;
import com.example.astha.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class ViewPagerActivity extends AppCompatActivity {

    ViewPager viewPager;
    DotsIndicator dot_1;
    SpringDotsIndicator dot_2;
    WormDotsIndicator dot_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        hook();
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        dot_1.setViewPager(viewPager);
        dot_2.setViewPager(viewPager);
        dot_3.setViewPager(viewPager);
    }

    private void hook() {
        viewPager=findViewById(R.id.ViewPager);
        dot_1=findViewById(R.id.dot_1);
        dot_2=findViewById(R.id.dot_2);
        dot_3=findViewById(R.id.dot_3);

    }
}