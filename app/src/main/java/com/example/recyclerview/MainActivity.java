package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.view.Menu;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mListaPalabras =
            new LinkedList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 20; i++) {
            mListaPalabras.addLast("Palabra " + i);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);

    }
}
