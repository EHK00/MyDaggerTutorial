package com.inicis.daggertutorial.di.module;

import android.arch.lifecycle.ViewModelProvider;

import com.inicis.daggertutorial.viewmodel.ViewModelProviderFactory;
import com.inicis.daggertutorial.viewmodel.MainActivityViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    MainActivityViewModel provideViewModel(){
        return new MainActivityViewModel();
    }

//    @Provides
//    ViewModelProvider.Factory provideMainActivityViewModelFactory(MainActivityViewModel viewModel){
//        return new ViewModelProviderFactory<>(viewModel);
//    }

}
