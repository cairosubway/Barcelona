package com.example.Barcelona;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;


public class SgActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sg);
    
        MyPagerAdapter adapter = new MyPagerAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.sgpager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);  
     
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sg, menu);
        return true;
    }
    class MyPagerAdapter extends PagerAdapter {
   	 
        public MyPagerAdapter() {
    		// TODO Auto-generated constructor stub
    	}

    	public int getCount() {
            return 5;
        }

        public Object instantiateItem(View collection, int position) {

            LayoutInflater inflater = (LayoutInflater) collection.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            int resId = 0;
            switch (position) {
            case 0:
                resId = R.layout.sg1;
                break;
            case 1:
                resId = R.layout.sg2;
                break;
            case 2:
                resId = R.layout.sg3;
                break;
            case 3:
                resId = R.layout.sg4;
                break;
            case 4:
                resId = R.layout.sg5;
                break;
            }

            View view = inflater.inflate(resId, null);

            ((ViewPager) collection).addView(view, 0);

            return view;
        }

        @Override
        public void destroyItem(View arg0, int arg1, Object arg2) {
            ((ViewPager) arg0).removeView((View) arg2);

        }


        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == ((View) arg1);

        }

        @Override
        public Parcelable saveState() {
            return null;
        }
    }





}
