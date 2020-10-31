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
import com.jatin.quadb_intern_test.model.Restaurants;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.Viewholder> {

    private Context context;
    private ArrayList<Restaurants> list;

    public RestaurantAdapter(Context context, ArrayList<Restaurants> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RestaurantAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.restaurant_row, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.Viewholder holder, int position) {
        holder.imageView.setBackgroundResource(list.get(position).getImage());
        holder.restaurant_name.setText(list.get(position).getName());
        holder.time.setText(list.get(position).getTime() + "min");
        holder.rating.setText(list.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView restaurant_name, time, rating;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            restaurant_name = itemView.findViewById(R.id.textView5);
            time = itemView.findViewById(R.id.textView4);
            rating = itemView.findViewById(R.id.textView6);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
