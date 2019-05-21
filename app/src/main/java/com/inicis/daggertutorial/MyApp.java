package com.inicis.daggertutorial;

import android.app.Application;

import com.inicis.daggertutorial.di.DaggerMyAppComponent;
import com.inicis.daggertutorial.di.MyAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


public class MyApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMyAppComponent.builder().create(this);
    }
}
