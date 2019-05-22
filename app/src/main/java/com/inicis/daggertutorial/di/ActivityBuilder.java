package com.inicis.daggertutorial.di;

import com.inicis.daggertutorial.di.module.MainActivityModule;
import com.inicis.daggertutorial.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            MainActivityModule.class})
    abstract MainActivity contributeMainActiivty();

}
