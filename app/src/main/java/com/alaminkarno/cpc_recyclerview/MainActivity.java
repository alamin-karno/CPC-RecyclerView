package com.alaminkarno.cpc_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<Student> studentList;
    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.studentRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        studentList = new ArrayList<>();
        adapter = new StudentAdapter(studentList,this);
        recyclerView.setAdapter(adapter);


        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"A","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"B","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"C","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"D","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));
        studentList.add(new Student(R.drawable.ic_baseline_account_circle_24,"Md. Al-Amin","12","CSE","PC-C"));

        adapter.notifyDataSetChanged();

    }
}