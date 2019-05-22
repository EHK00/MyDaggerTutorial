package com.inicis.daggertutorial.di;

import android.app.Application;

import com.inicis.daggertutorial.MyApp;
import com.inicis.daggertutorial.di.module.NetworkModule;
import com.inicis.daggertutorial.di.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,
        NetworkModule.class,
        ViewModelModule.class,
        ActivityBuilder.class})
public interface MyAppComponent extends AndroidInjector<MyApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApp> {
    }

    ;

}
