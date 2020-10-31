package com.jatin.quadb_intern_test.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jatin.quadb_intern_test.R;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class FilterAdapter extends RecyclerView.Adapter<FilterAdapter.Viewholder> {

    private Context context;
    private ArrayList<String> list;

    public FilterAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public FilterAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.column_filter, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterAdapter.Viewholder holder, int position) {
        holder.name.setText(list.get(position));
        if(position == 0){
            holder.image1.setBackgroundResource(R.drawable.ic_filter_list_black_24dp);
        }
        else if(position == 5){
            holder.image2.setBackgroundResource(R.drawable.ic_arrow_drop_down_black_24dp);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView image1, image2;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.filter_name);
            image1 = itemView.findViewById(R.id.image1);
            image2 = itemView.findViewById(R.id.image2);
        }
    }
}
