package com.nomad.country;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ContViewHolder>{

    private Context context;
    private OnClick onClick;

    ArrayList<Continents> names = new ArrayList<>();

    public Adapter(ArrayList<Continents> names,OnClick onClick) {
        this.names = names;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        return new ContViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContViewHolder holder, int position) {
        holder.bind(names.get(position),context);
        holder.itemView.setOnClickListener(view -> {
            onClick.onClick(continents.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    static class ContViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private ImageView image;

        public ContViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.names);
            image=itemView.findViewById(R.id.image);


        }

        public void bind(Continents continents, Context context) {
            name.setText(continents.getName());
            Glide.with(context).load(continents.getImage()).into(image);



        }
    }
}