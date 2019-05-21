package com.inicis.daggertutorial.temp;

import android.arch.lifecycle.ViewModel;
import android.os.Bundle;
import android.support.annotation.Nullable;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity<T extends ViewModel> extends DaggerAppCompatActivity {

    private T viewModel;


    public abstract T getViewModel();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel = viewModel == null ? getViewModel() : viewModel;
    }
}
