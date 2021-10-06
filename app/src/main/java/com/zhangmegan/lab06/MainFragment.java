package com.zhangmegan.lab06;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

public class MainFragment extends Fragment {
    ViewPager2 vp;
    public static Fragment newInstance(ViewPager2 myVP2) {
        MainFragment fragment = new MainFragment();
        fragment.vp = myVP2;
    }
}
