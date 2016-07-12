package com.powerleader.styletestandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.powerleader.styletestandroid.view.MyActivity;

public class MainActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
