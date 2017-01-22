package com.m68476521.mike.duk;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DUNActivity extends SingleFragmentActivity {
    //Testing commit

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
    @Override
    public Fragment createFragment() {
        return DUNFragment.newInstance();
    }
}
