package com.inicis.daggertutorial.temp;

import android.arch.lifecycle.ViewModel;
import android.content.Context;

import dagger.android.support.DaggerFragment;

public abstract class BaseFragment<T extends ViewModel> extends DaggerFragment {

    private T viewModel;

    public abstract T getViewModel();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        viewModel = getViewModel();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
