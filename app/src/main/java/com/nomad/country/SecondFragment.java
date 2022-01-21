package com.nomad.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class SecondFragment extends Fragment {


    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Country> listSecond;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycle_second);
        adapter = new Adapter(listSecond);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        listSecond = new ArrayList<>();
        listSecond.add(new Country("Asia",R.drawable.ic_kg,"Kyrgyzstan"));
        listSecond.add(new Country("Asia",R.drawable.ic_kg,"Kyrgyzstan"));
        listSecond.add(new Country("Asia",R.drawable.ic_kg,"Kyrgyzstan"));
    }

}