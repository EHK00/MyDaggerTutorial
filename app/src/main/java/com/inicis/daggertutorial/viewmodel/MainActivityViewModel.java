package com.inicis.daggertutorial.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import javax.inject.Inject;

public class MainActivityViewModel extends ViewModel {
    String s;

    @Inject
    public MainActivityViewModel() {
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
