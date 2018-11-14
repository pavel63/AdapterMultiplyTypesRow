package com.example.user.multiplyrowtypesadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<Model>modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);

        linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        modelList = new ArrayList<>();

        Model model = new Model(0,"a");
        Model model2 = new Model(2,"b");
        Model model3 = new Model(0,"c");
        Model model4 = new Model(1,"d");
        Model model5 = new Model(1,"e");

        modelList .add(model);
        modelList .add(model2);
        modelList .add(model3);
        modelList .add(model4);
        modelList .add(model5);

        RvMultiplyAdapter rvMultiplyAdapter = new RvMultiplyAdapter(modelList);
        recyclerView .setLayoutManager(linearLayoutManager);
        recyclerView .setAdapter(rvMultiplyAdapter);

    }
}
