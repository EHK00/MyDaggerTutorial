package com.inicis.daggertutorial.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.inicis.daggertutorial.data.model.Repo;
import com.inicis.daggertutorial.data.rest.RepoRepository;
import com.inicis.daggertutorial.temp.NotNullMutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class RepoListFragmentViewModel extends ViewModel {

    private final RepoRepository repoRepository;
    private CompositeDisposable disposable;

//    public NotNullMutableLiveData<List<Repo>> repos = new NotNullMutableLiveData<>(new ArrayList<Repo>());
    public MutableLiveData<List<Repo>> repos = new MutableLiveData<>();

    @Inject
    public RepoListFragmentViewModel(RepoRepository repoRepository) {
        this.repoRepository = repoRepository;
        disposable = new CompositeDisposable();
        init();
        fetchRepos();
    }

    private void init(){
        repos.setValue(new ArrayList<Repo>());
    }

    private void fetchRepos() {
        disposable.add(repoRepository.getRepositories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<List<Repo>>() {
                    @Override
                    public void onSuccess(List<Repo> value) {
                        repos.setValue(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }
                }));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (disposable != null) {
            disposable.clear();
            disposable = null;
        }
    }
}
