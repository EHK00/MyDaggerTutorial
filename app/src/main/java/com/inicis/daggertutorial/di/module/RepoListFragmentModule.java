package com.inicis.daggertutorial.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.inicis.daggertutorial.data.rest.RepoRepository;
import com.inicis.daggertutorial.data.rest.RepoService;
import com.inicis.daggertutorial.di.ViewModelKey;
import com.inicis.daggertutorial.viewmodel.RepoListFragmentViewModel;
import com.inicis.daggertutorial.viewmodel.ViewModelProviderFactory;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public abstract class RepoListFragmentModule {


}
