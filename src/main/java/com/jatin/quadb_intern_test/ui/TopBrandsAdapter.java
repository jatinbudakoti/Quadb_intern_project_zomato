package com.jatin.quadb_intern_test.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.jatin.quadb_intern_test.R;
import com.jatin.quadb_intern_test.model.Brands;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TopBrandsAdapter extends RecyclerView.Adapter<TopBrandsAdapter.Viewholder> {
    private Context context;
    private ArrayList<Brands> list;

    public TopBrandsAdapter(Context context, ArrayList<Brands> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public TopBrandsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.top_brands_column, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TopBrandsAdapter.Viewholder holder, int position) {
        holder.imageButton.setBackgroundResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName().toString());
        holder.time.setText(list.get(position).getTime() +  " min");


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public ImageButton imageButton;
        public TextView name, time;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageButton = itemView.findViewById(R.id.brandImage);
            name = itemView.findViewById(R.id.brand_name);
            time = itemView.findViewById(R.id.time);
        }
    }
}
