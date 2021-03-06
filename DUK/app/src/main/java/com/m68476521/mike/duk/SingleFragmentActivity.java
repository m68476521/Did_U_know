package com.m68476521.mike.duk;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by miguel on 1/19/17.
 */

//public class SingleFragmentActivity {
//}


//package com.bignerdrach.android.photogallery;

//        import android.os.Bundle;
//        import android.support.annotation.LayoutRes;
//        import android.support.v4.app.Fragment;
//        import android.support.v4.app.FragmentActivity;
//        import android.support.v4.app.FragmentManager;
//        import android.support.v7.app.AppCompatActivity;

/**
 * Created by m68476521 on 9/5/16.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @LayoutRes
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(getLayoutResId());

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}