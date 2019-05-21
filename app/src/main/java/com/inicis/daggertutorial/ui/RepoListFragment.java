package com.inicis.daggertutorial.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inicis.daggertutorial.R;
import com.inicis.daggertutorial.databinding.FragmentRepoListBinding;
import com.inicis.daggertutorial.temp.BaseFragment;
import com.inicis.daggertutorial.viewmodel.RepoListFragmentViewModel;

import javax.inject.Inject;

public class RepoListFragment extends BaseFragment<RepoListFragmentViewModel> {
    private RepoListFragmentViewModel viewModel;
    private FragmentRepoListBinding binding;

    @Inject
    ViewModelProvider.Factory factory;


    @Override
    public RepoListFragmentViewModel getViewModel() {
        viewModel = ViewModelProviders.of(this, factory).get(RepoListFragmentViewModel.class);
        return viewModel;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_repo_list, container, false);
        View view = binding.getRoot();

        return view;
    }


}
