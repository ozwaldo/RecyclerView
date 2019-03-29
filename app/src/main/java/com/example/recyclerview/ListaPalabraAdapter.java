package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ListaPalabraAdapter extends
        RecyclerView.Adapter<ListaPalabraAdapter.PalabraViewHolder> {
    @NonNull
    @Override
    public ListaPalabraAdapter.PalabraViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListaPalabraAdapter.PalabraViewHolder palabraViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class PalabraViewHolder extends RecyclerView.ViewHolder {

        public PalabraViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
