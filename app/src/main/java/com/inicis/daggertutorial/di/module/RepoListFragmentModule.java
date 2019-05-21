package com.inicis.daggertutorial.di.module;

import android.arch.lifecycle.ViewModelProvider;

import com.inicis.daggertutorial.data.rest.RepoRepository;
import com.inicis.daggertutorial.data.rest.RepoService;
import com.inicis.daggertutorial.viewmodel.RepoListFragmentViewModel;
import com.inicis.daggertutorial.viewmodel.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class RepoListFragmentModule {

    @Provides
    RepoListFragmentViewModel provideViewModel(RepoRepository repoRepository){
        return new RepoListFragmentViewModel(repoRepository);
    }

    @Provides
    RepoRepository provideRepository(RepoService repoService){
        return new RepoRepository(repoService);
    }

    @Provides
    ViewModelProvider.Factory provideRepoListFragmentViewModelFactoryProvider(RepoListFragmentViewModel viewModel){
        return new ViewModelProviderFactory<>(viewModel);
    }
}
