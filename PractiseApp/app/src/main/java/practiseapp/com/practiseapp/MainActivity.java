package practiseapp.com.practiseapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewpager;
    SwipeAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new SwipeAdapter(this);
        viewpager.setAdapter(adapter);
    }
}
