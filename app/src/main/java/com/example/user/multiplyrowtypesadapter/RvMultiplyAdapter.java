package com.example.user.multiplyrowtypesadapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class RvMultiplyAdapter extends RecyclerView.Adapter {

    private List<Object>modelList;

    public RvMultiplyAdapter(List<Object>modelList){
        this .modelList = modelList;
    }


    @Override
    public int getItemViewType(int position) {

        Object object = modelList .get(position);

        if(object instanceof Model){
        return 0;
        } else
         if(object instanceof Model2){
            return 1;
         } else
             if(object instanceof Model3){
            return 2;
         } else return -1;

      /*  switch (modelList .get(position).modelType) {
            case 0:
                return Model.TEXT_TYPE;
            case 1:
                return Model.RB_TYPE;
            case 2:
                return Model.VIEW_TYPE;
            default:
                return -1;
        } */
    }




    @Override
    public int getItemCount() {
        return modelList .size();
    }




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_1, parent, false);
                return new FirstTypeHolder(view);
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_2, parent, false);
                return new SecondTypeHolder(view);
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_3, parent, false);
                return new ThirdTypeHolder(view);
        }
        return null;

    }





    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int listPosition) {

        Object object = modelList .get(listPosition);

        if(object instanceof Model){
            ((FirstTypeHolder) holder) .textView .setText(((Model) object) .getInnerText());
        } else
        if(object instanceof Model2){
            ((SecondTypeHolder) holder). radioButton .setChecked(((Model2) object). isChecked());
        } else
        if(object instanceof Model3){
            ((ThirdTypeHolder) holder). button .setBackgroundColor(Color.parseColor(((Model3) object) .getColor()));
        } else {

        }
        }





    public static class FirstTypeHolder extends RecyclerView.ViewHolder{
     TextView textView;
       FirstTypeHolder(View view){
           super(view);
         textView = view.findViewById(R.id.textView);
       }
   }


    public static class SecondTypeHolder extends RecyclerView.ViewHolder {
        RadioButton radioButton;
        SecondTypeHolder(View view) {
            super(view);
           radioButton = view .findViewById(R.id.radioButton);
        }
    }


        public static class ThirdTypeHolder extends RecyclerView.ViewHolder {
        Button button;
            ThirdTypeHolder(View view) {
                super(view);
                button = view .findViewById(R.id.button);
            }
        }
    }