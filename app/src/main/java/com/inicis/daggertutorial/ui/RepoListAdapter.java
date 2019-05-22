package com.inicis.daggertutorial.ui;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inicis.daggertutorial.R;
import com.inicis.daggertutorial.data.model.Repo;
import com.inicis.daggertutorial.databinding.ItemRepoBinding;

import java.util.List;

public class RepoListAdapter extends RecyclerView.Adapter<RepoListAdapter.RepoViewHolder> {
    List<Repo> items;

    public RepoListAdapter(List<Repo> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RepoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new RepoViewHolder(
                LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_repo, viewGroup,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull RepoViewHolder repoViewHolder, int i) {
        repoViewHolder.binding.setItem(items.get(i));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class RepoViewHolder extends RecyclerView.ViewHolder{
        private final ItemRepoBinding binding;

        public RepoViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

}
