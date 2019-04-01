package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class ListaPalabraAdapter extends
        RecyclerView.Adapter<ListaPalabraAdapter.PalabraViewHolder> {

    private final LinkedList<String> listaPalabras;
    private LayoutInflater inflater;

    public ListaPalabraAdapter(Context context, LinkedList<String> listaPalabras) {
        inflater = LayoutInflater.from(context);
        this.listaPalabras = listaPalabras;
    }

    @NonNull
    @Override
    public ListaPalabraAdapter.PalabraViewHolder onCreateViewHolder
            (@NonNull ViewGroup viewGroup, int i) {

        View itemView = inflater.inflate(R.layout.listapalabra_item,
                viewGroup, false);

        return new PalabraViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder
            (@NonNull ListaPalabraAdapter.PalabraViewHolder palabraViewHolder, int i) {

        String actual = listaPalabras.get(i);
        palabraViewHolder.tvPalabra.setText(actual);

    }

    @Override
    public int getItemCount() {
        return listaPalabras.size();
    }

    class PalabraViewHolder extends RecyclerView.ViewHolder {
        public final TextView tvPalabra;
        final ListaPalabraAdapter adapter;

        public PalabraViewHolder(@NonNull View itemView, ListaPalabraAdapter adapter) {
            super(itemView);
            this.tvPalabra = itemView.findViewById(R.id.palabra);
            this.adapter = adapter;
        }


    }
}
