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
    List<Object>modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);

        linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        modelList = new ArrayList<>();


        Model model = new Model();
        model .setInnerText("a");
        Model model2 = new Model();
        model2 .setInnerText("b");
        Model model3 = new Model();
        model3 .setInnerText("c");

        Model2 model21 = new Model2();
        model21 .setChecked(false);
        Model2 model22 = new Model2();
        model22 .setChecked(true);

        Model3 model31 = new Model3();
        model31 .setColor("#9a0032");
        Model3 model32 = new Model3();
        model32 .setColor("#4a8fe2");

        modelList .add(model21);
        modelList .add(model);
        modelList .add(model2);
        modelList .add(model31);
        modelList .add(model3);
        modelList .add(model22);
        modelList .add(model32);


        RvMultiplyAdapter rvMultiplyAdapter = new RvMultiplyAdapter(modelList);
        recyclerView .setLayoutManager(linearLayoutManager);
        recyclerView .setAdapter(rvMultiplyAdapter);

    }
}
