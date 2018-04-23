package com.example.jxr.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jxr on 27/3/18.
 */

public class MainFragment extends Fragment {
    View vMain;

    @Nullable
    public View onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vMain = inflater.inflate(R.layout.fragment_main, container, false);
        return vMain;
    }
}
