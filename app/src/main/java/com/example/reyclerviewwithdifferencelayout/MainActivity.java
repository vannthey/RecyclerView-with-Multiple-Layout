package com.example.reyclerviewwithdifferencelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        List<View> listitem = new ArrayList<>();
        one one = new one("Mango","Tree");
        two two = new two("Orange","Tree");
        three three = new three("Avocado");

        listitem.add(new View(2,three));
        listitem.add(new View(0,one));
        listitem.add(new View(1,two));
        listitem.add(new View(2,three));
        listitem.add(new View(2,three));
        listitem.add(new View(2,three));
        listitem.add(new View(2,three));
        listitem.add(new View(2,three));
        listitem.add(new View(2,three));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(listitem));
    }
}