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

public class Adapter extends RecyclerView.Adapter<Adapter.ContViewHolder> {

    private Context context;
    private OnClick onClick;

    ArrayList<Continents> names = new ArrayList<>();
    ArrayList<Country> listSecond = new ArrayList<>();

    public Adapter(ArrayList<Continents> names, OnClick onClick) {
        this.names = names;
        this.onClick = onClick;
    }

    public Adapter(ArrayList<Country> listSecond) {
        this.listSecond = listSecond;
    }

    @NonNull
    @Override
    public ContViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false);
        ContViewHolder contViewHolder=new ContViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
        ContViewHolder contViewHolder1=new ContViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
        return contViewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull ContViewHolder holder, int position) {
        holder.bind(names.get(position), context);
        holder.bind(listSecond.get(position), context);
        holder.itemView.setOnClickListener(view -> {
            onClick.onClick(names.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    static class ContViewHolder extends RecyclerView.ViewHolder {
        private TextView name,nameContinent,nameCountry;
        private ImageView image,imageFlags;



        public ContViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.names);
            image = itemView.findViewById(R.id.image);

            imageFlags = itemView.findViewById(R.id.image_second);
            nameContinent = itemView.findViewById(R.id.tv_continents);
            nameCountry = itemView.findViewById(R.id.tv_country);



        }

        public void bind(Continents continents, Context context) {
            name.setText(continents.getName());

            Glide.with(context).load(continents.getImage()).into(image);

        }

        public void bind(Country country, Context context) {
            nameCountry.setText(country.getNameCountry());
            nameContinent.setText(country.getName());
            Glide.with(context).load(country.getImage()).into(imageFlags);
        }
    }
}