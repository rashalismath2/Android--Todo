package com.ismathlifehacks.mytodoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> todoTitle=new ArrayList<>();
    private ArrayList<String> todoDescription=new ArrayList<>();
    private ArrayList<String> todoTime=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoTitle.add("Buy milk");
        todoTitle.add("Learn this");
        todoTitle.add("Learn that");

        todoDescription.add("I dont reall want to say anything");
        todoDescription.add("I dont want to learn this");
        todoDescription.add("I dont reall want to learn that");

        todoTime.add("Tomo");
        todoTime.add("This afternoon");
        todoTime.add("night");

        RecyclerView todoRecycler=findViewById(R.id.main_recycler_second);
        TodoRecyclerViewAdapter adapter=new TodoRecyclerViewAdapter(todoTitle,todoDescription,todoTime,this);
        todoRecycler.setAdapter(adapter);
        todoRecycler.setLayoutManager(new LinearLayoutManager(this));

        //TODO add sqlite

    }
}
