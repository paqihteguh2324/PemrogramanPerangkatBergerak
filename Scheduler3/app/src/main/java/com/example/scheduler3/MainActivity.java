package com.example.scheduler3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.scheduler3.Adapter.ToDoAdapter;
import com.example.scheduler3.Model.ToDoModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private RecyclerView tasksRecyclerView;
    private ToDoAdapter tasksAdapter;
    private List<ToDoModel> taskList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Objects.requireNonNull(getSupportActionBar()).hide();
        taskList = new ArrayList<>();

        tasksRecyclerView = findViewById(R.id.tasksRecyclerView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasksAdapter = new ToDoAdapter(MainActivity.this);


        ToDoModel task = new ToDoModel();
        task.setTask("ini adalah task");
        task.setStatus(0);
        task.setId(1);
//
        taskList.add(task);
        taskList.add(task);
        tasksAdapter.setTask(taskList);
        tasksRecyclerView.setAdapter(tasksAdapter);


    }
}