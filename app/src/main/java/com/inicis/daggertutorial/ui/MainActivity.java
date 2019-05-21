package com.inicis.daggertutorial.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.inicis.daggertutorial.R;
import com.inicis.daggertutorial.databinding.ActivityMainBinding;
import com.inicis.daggertutorial.temp.BaseActivity;
import com.inicis.daggertutorial.viewmodel.MainActivityViewModel;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<MainActivityViewModel> {

    private ActivityMainBinding binding;

//    @Inject
//    MainActivityViewModel viewModel;

//    @Inject
//    ViewModelProvider.Factory factory;
    @Inject
    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initBinding();

        setSupportActionBar(binding.toolbar);
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.content, new RepoListFragment()).commit();
    }

    private void initBinding(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVm(viewModel);
    }

    @Override
    public MainActivityViewModel getViewModel() {
//        viewModel = ViewModelProviders.of(this, factory).get(MainActivityViewModel.class);
//        viewModel = new MainActivityViewModel();
        return viewModel;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
