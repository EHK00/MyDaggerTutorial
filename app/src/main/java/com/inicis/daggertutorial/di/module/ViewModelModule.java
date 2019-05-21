package com.inicis.daggertutorial.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.inicis.daggertutorial.di.ViewModelKey;
import com.inicis.daggertutorial.viewmodel.MainActivityViewModel;
import com.inicis.daggertutorial.viewmodel.RepoListFragmentViewModel;
import com.inicis.daggertutorial.viewmodel.ViewModelFactory;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel.class)
    abstract ViewModel bindMainActivityViewModel(MainActivityViewModel mainActivityViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RepoListFragmentViewModel.class)
    abstract ViewModel bindRepoListFragmentViewModel(RepoListFragmentViewModel repoListFragmentViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
