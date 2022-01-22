package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.hw1.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Model> list = new ArrayList<>();
        list.add(new Model("Miki", "+996774021218"));
        list.add(new Model("Brat", "+996775142014"));
        list.add(new Model("Mama", "+996772434360"));
        list.add(new Model("Dani", "+996774805651"));
        list.add(new Model("Chyngyz", "+996551515243"));
        list.add(new Model("Igor", "+996557056263"));
        list.add(new Model("Abay", "+996554840490"));
        Adapter adapter = new Adapter(list, this);
        RecyclerView recyclerView = findViewById(R.id.rv_contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}