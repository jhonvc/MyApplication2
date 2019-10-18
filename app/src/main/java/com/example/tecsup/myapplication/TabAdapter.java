package com.example.tecsup.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabAdapter extends FragmentStatePagerAdapter {
    int cant_tabs;

    public TabAdapter(FragmentManager fm,int cant_tabs) {
        super(fm);
        this.cant_tabs=cant_tabs;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new CategoriasFragment();
    }else{


        return new ProveedoresFragment();
    }
    }

    @Override
    public int getCount() {
        return cant_tabs;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        


        return "Pagina"+position;
    }

}
