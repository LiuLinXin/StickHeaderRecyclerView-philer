package com.philer.demo.stickheaderrecycleview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recycle;
    private List<String> dates = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle = (RecyclerView) findViewById(R.id.recycle);

        for(int i=0;i<66;i++){
            dates.add("date : "+i);
        }

        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setAdapter(new NormalAdapter(this, dates));
        recycle.addItemDecoration(new StickHeaderDecoration(recycle));
    }

}
