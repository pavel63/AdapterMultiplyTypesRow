package com.example.user.multiplyrowtypesadapter;

public class Model {

    public static final int TEXT_TYPE=0;
    public static final int RB_TYPE=1;
    public static final int VIEW_TYPE=2;

    public int modelType;
    public String innerText;
    public Model(int modelType, String innerText){
        this .innerText = innerText;
        this .modelType = modelType;
    }

}
