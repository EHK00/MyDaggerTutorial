package com.inicis.daggertutorial.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.inicis.daggertutorial.data.model.Repo;

import java.util.List;

public class BindingAdapter {

    @android.databinding.BindingAdapter("repositories")
    public static void setAdapter(RecyclerView view, List<Repo> items){
        RecyclerView.Adapter adapter = view.getAdapter();
        if(adapter == null){
            view.setAdapter(new RepoListAdapter(items));
            return;
        }

        if(adapter instanceof RepoListAdapter){
            ((RepoListAdapter) adapter).items = items;
            adapter.notifyDataSetChanged();
        }

    }
}
