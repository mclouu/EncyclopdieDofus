package com.romain.mathieu.encyclopdiedofus.feature.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.romain.mathieu.encyclopdiedofus.feature.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.equipementViewHolder> {
    @NonNull
    @Override
    public equipementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new equipementViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull equipementViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class equipementViewHolder extends RecyclerView.ViewHolder {
        public equipementViewHolder(View itemView) {
            super(itemView);
        }
    }
}
