package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mListaPalabras =
            new LinkedList<>();

    private RecyclerView recyclerView;
    private ListaPalabraAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tamListaPalabras = mListaPalabras.size();
                mListaPalabras.addLast("+ Palabra " + tamListaPalabras);
                recyclerView.getAdapter().notifyItemInserted(tamListaPalabras);

                recyclerView.smoothScrollToPosition(tamListaPalabras);
                Toast.makeText(getApplicationContext(), "Add Elemento", Toast.LENGTH_SHORT).show();
            }
        });

        for (int i = 0; i < 20; i++) {
            mListaPalabras.addLast("Palabra " + i);
        }

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new ListaPalabraAdapter(this, mListaPalabras);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);

    }
}
