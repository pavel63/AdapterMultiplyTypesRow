package com.example.user.multiplyrowtypesadapter;

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

    private List<Model>modelList;

    public RvMultiplyAdapter(List<Model>modelList){
        this .modelList = modelList;
    }




    @Override
    public int getItemViewType(int position) {

        switch (modelList .get(position).modelType) {
            case 0:
                return Model.TEXT_TYPE;
            case 1:
                return Model.RB_TYPE;
            case 2:
                return Model.VIEW_TYPE;
            default:
                return -1;
        }
    }




    @Override
    public int getItemCount() {
        return modelList .size();
    }





    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        switch (viewType) {
            case Model.TEXT_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_1, parent, false);
                return new FirstTypeHolder(view);
            case Model.RB_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_2, parent, false);
                return new SecondTypeHolder(view);
            case Model.VIEW_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_3, parent, false);
                return new ThirdTypeHolder(view);
        }
        return null;
    }





    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int listPosition) {

    Model object = modelList .get(listPosition);
        if (object != null) {
        switch (object.modelType) {
            case Model.TEXT_TYPE:
           //     ((FirstTypeHolder) holder).txtType.setText(object.text);

                break;
            case Model.RB_TYPE:
             //   ((SecondTypeHolder) holder).txtType.setText(object.text);
              //  ((SecondTypeHolder) holder).image.setImageResource(object.data);
                break;
            case Model.VIEW_TYPE:

           //     ((ThirdTypeHolder) holder).txtType.setText(object.text);

        }
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