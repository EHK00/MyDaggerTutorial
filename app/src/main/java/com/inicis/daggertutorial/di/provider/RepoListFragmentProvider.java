package com.inicis.daggertutorial.di.provider;

import com.inicis.daggertutorial.di.module.RepoListFragmentModule;
import com.inicis.daggertutorial.ui.RepoListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class RepoListFragmentProvider {
    @ContributesAndroidInjector(modules = RepoListFragmentModule.class)
    abstract RepoListFragment provideRepoListFragmentFacotory();
}
