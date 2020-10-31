package com.jatin.quadb_intern_test.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jatin.quadb_intern_test.R;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.Viewholder> {

    private Context context;
    private ArrayList<Integer> list;

    public PersonAdapter(Context context, ArrayList<Integer> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public PersonAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.person_column, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.Viewholder holder, int position) {
        holder.imageButton.setBackgroundResource(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public ImageButton imageButton;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageButton = itemView.findViewById(R.id.personImage);
        }
    }
}
