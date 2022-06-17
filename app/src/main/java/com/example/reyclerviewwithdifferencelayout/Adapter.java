package com.example.reyclerviewwithdifferencelayout;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<View> itemView;

    public Adapter(List<View> itemView) {
        this.itemView = itemView;
    }

    @Override
    public int getItemViewType(int position) {
        return itemView.get(position).getViewType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        if (viewType==0){
            return new oneHolder(layoutInflater.inflate(R.layout.layout_one,parent,false));
        }else if (viewType==1){
            return new twoHolder(layoutInflater.inflate(R.layout.layout_two,parent,false));
        }else if (viewType==2){
            return new threeHolder(layoutInflater.inflate(R.layout.layout_three,parent,false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position)==0){
            one one = (com.example.reyclerviewwithdifferencelayout.one) itemView.get(position).getObject();
            oneHolder oneHolder = (Adapter.oneHolder) holder;
            oneHolder.setViewOne(one);
        }else if (getItemViewType(position)==1){
            two two = (com.example.reyclerviewwithdifferencelayout.two) itemView.get(position).getObject();
            twoHolder twoHolder = (Adapter.twoHolder) holder;
            twoHolder.setViewTwo(two);
        }else if (getItemViewType(position)==2){
            three three = (com.example.reyclerviewwithdifferencelayout.three) itemView.get(position).getObject();
            threeHolder threeHolder = (Adapter.threeHolder) holder;
            threeHolder.setViewThree(three);
        }
    }
    @Override
    public int getItemCount() {
        return itemView.size();
    }

    static class oneHolder extends RecyclerView.ViewHolder{
        TextView txt1,txt2;
        public oneHolder(@NonNull android.view.View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.txt_layoutone_1);
            txt2 = itemView.findViewById(R.id.txt_layoutone_2);
        }
        public void setViewOne(one one){
            txt1.setText(one.getTxt1());
            txt2.setText(one.getTxt2());
        }
    }
    static class twoHolder extends RecyclerView.ViewHolder{
        TextView txt1,txt2;
        public twoHolder(@NonNull android.view.View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.txt_layouttwo_1);
            txt2=itemView.findViewById(R.id.txt_layouttwo_2);
        }
        public void setViewTwo(two two){
            txt1.setText(two.getTxt1());
            txt2.setText(two.getTxt2());
        }
    }
    static class threeHolder extends RecyclerView.ViewHolder{
        TextView txt1;
        public threeHolder(@NonNull android.view.View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.txt_layoutthree_1);
        }
        public void setViewThree(three three){
            txt1.setText(three.getTxt());
        }
    }
}
