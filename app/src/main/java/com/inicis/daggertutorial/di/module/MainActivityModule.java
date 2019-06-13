package com.inicis.daggertutorial.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;

import com.inicis.daggertutorial.di.ViewModelKey;
import com.inicis.daggertutorial.ui.MainActivity;
import com.inicis.daggertutorial.ui.RepoListFragment;
import com.inicis.daggertutorial.viewmodel.RepoListFragmentViewModel;
import com.inicis.daggertutorial.viewmodel.ViewModelProviderFactory;
import com.inicis.daggertutorial.viewmodel.MainActivityViewModel;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainActivityModule {

    @ContributesAndroidInjector
    abstract RepoListFragment contributeRepoListFragment();






}
